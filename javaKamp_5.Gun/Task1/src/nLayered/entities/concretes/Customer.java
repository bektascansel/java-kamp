package nLayered.entities.concretes;

import nLayered.entities.abstracts.Entity;

public class Customer implements Entity{
	
	private String name;
	private String lastName;
	private String ePosta;
	private String password;
	
	public Customer(String name, String lastName, String ePosta, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	

}
