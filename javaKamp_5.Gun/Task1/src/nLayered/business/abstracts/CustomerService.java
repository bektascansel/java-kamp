package nLayered.business.abstracts;

import nLayered.entities.concretes.Customer;

public interface CustomerService {
	public void signUp(Customer customer);//kay�t olmak
	public void logIn(Customer customer);//giri� yapmak
}
