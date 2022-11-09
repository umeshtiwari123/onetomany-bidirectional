package onetomanybidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybidirectional.dto.Phone;
import onetomanybidirectional.dto.SIM;


public class PhoneDao {

	public void savePhone(Phone phone)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(phone);
		
		List<SIM> simcards=phone.getSimcards();
		for (SIM sim : simcards) {
			entityManager.persist(sim);
		}
		
		entityTransaction.commit();
	}
}
