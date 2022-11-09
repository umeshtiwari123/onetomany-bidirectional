package onetomanybidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import onetomanybidirectional.dao.PhoneDao;
import onetomanybidirectional.dto.Phone;
import onetomanybidirectional.dto.SIM;

public class PhoneController {

	public static void main(String[] args) {
		
		Phone phone=new Phone();
		phone.setId(1);
		phone.setModel("Samsung");
		phone.setPrice(10000);
		phone.setColour("Blue");
		
		SIM sim1=new SIM();
		sim1.setId(1234);
		sim1.setCost(20);
		sim1.setPhone(phone);
		
		SIM sim2=new SIM();
		sim2.setId(4321);
		sim2.setCost(40);
		sim2.setPhone(phone);
		
		List<SIM> sim=new ArrayList<SIM>();
		sim.add(sim1);
		sim.add(sim2);
		
		phone.setSimcards(sim);
		
		PhoneDao phonedao=new PhoneDao();
		
		phonedao.savePhone(phone);
		
		
	}
}
