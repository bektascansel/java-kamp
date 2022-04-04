package nLayered;

import nLayered.business.concretes.CheckCustomerManager;
import nLayered.business.concretes.CustomerManager;
import nLayered.business.concretes.VerifityManager;
import nLayered.dataAccess.concretes.HibernateDao;
import nLayered.entities.concretes.Customer;
import nLayered.google.googleManager;

public class Main {

	public static void main(String[] args) {
	  
		Customer customer=new Customer("cansel","bektas","cansel.bektas6447@gmail.com","cancanc");
		CustomerManager customerManager=new CustomerManager(new HibernateDao(),new VerifityManager(),new CheckCustomerManager());
		customerManager.signUp(customer);
		googleManager googlemanager=new googleManager();
		googlemanager.signUp();
		customerManager.logIn(customer);
		

	}

}
