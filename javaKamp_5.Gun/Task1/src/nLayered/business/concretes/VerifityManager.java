package nLayered.business.concretes;

import nLayered.business.abstracts.VerifityService;
import nLayered.entities.concretes.Customer;

public class VerifityManager implements VerifityService{

	@Override
	public void ePostaVerification(Customer customer) {
		System.out.println("sended mail of verifity mail : "+customer.getePosta());
		
	}

	@Override
	public boolean isVerified(Customer customer) {
	    System.out.println("Email verified");
		return true;
	}

}
