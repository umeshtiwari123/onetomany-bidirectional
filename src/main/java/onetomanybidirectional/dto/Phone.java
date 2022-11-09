package onetomanybidirectional.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {

	@Id
	private int id;
	private String model;
	private int price;
	private String colour;
	
	@OneToMany
	private List<SIM> simcards;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public List<SIM> getSimcards() {
		return simcards;
	}

	public void setSimcards(List<SIM> simcards) {
		this.simcards = simcards;
	}
	
	
}
