package nLayered.business.abstracts;

import nLayered.entities.concretes.Customer;

public interface VerifityService {
	void ePostaVerification(Customer customer);
    boolean isVerified(Customer customer);

}
