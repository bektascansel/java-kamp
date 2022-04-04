package nLayered.business.abstracts;

import nLayered.entities.concretes.Customer;

public interface CheckCustomer {
	
	boolean nameCheck(Customer customer);
	boolean lastNameCheck(Customer customer);
	boolean ePostaCheck(Customer customer);
	boolean passwordCheck(Customer customer);
	boolean isUsedEPosta(Customer customer);
	boolean trueEpostaPassword(Customer customer);
}
