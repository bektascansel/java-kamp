package nLayered.business.concretes;

import nLayered.business.abstracts.CheckCustomer;
import nLayered.business.abstracts.CustomerService;
import nLayered.business.abstracts.VerifityService;
import nLayered.dataAccess.abstracts.CustomerDao;
import nLayered.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	VerifityService verifity;
	CheckCustomer  checkCustomer;
	CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao,VerifityService verifity,CheckCustomer checkCustomer) {
		super();
		this.customerDao = customerDao;
		this.verifity=verifity;
		this.checkCustomer=checkCustomer;
	}

	
	

	@Override
	//kayýt olmak
	public void signUp(Customer customer) {
        if(checkCustomer.nameCheck(customer)==true&&checkCustomer.lastNameCheck(customer)==true&&checkCustomer.ePostaCheck(customer)==true
        		&&checkCustomer.passwordCheck(customer)==true&&checkCustomer.isUsedEPosta(customer)==false) {
        	System.out.println("customer information is valid");
        	customerDao.add(customer);
        	verifity.ePostaVerification(customer);
        	System.out.println("please verify email");
        	verifity.isVerified(customer);
        }else {
        	System.out.println("customer information is not valid");
        }
        
        
		
	}

	@Override
	//giriþ yapmak
	public void logIn(Customer customer) {
	     if(customer.getePosta()!=null&&customer.getPassword()!=null) {
	    	 if(checkCustomer.trueEpostaPassword(customer)==true) {
	    	 System.out.println("Login successful");
	     }else {
	    	 System.out.println("Login not successful! Wrong password or eposta");
	     }
	
	     }

}
}
