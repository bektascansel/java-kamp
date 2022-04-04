package nLayered.business.abstracts;

import nLayered.entities.concretes.Customer;

public interface CustomerService {
	public void signUp(Customer customer);//kayýt olmak
	public void logIn(Customer customer);//giriþ yapmak
}
