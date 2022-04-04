package nLayered.business.concretes;

import nLayered.business.abstracts.CheckCustomer;
import nLayered.business.abstracts.CustomerService;
import nLayered.dataAccess.abstracts.CustomerDao;
import nLayered.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	VerifityManager verifityManager=new VerifityManager();
	CheckCustomerManager checkCustomerManager=new CheckCustomerManager();
	CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	
	

	@Override
	//kayýt olmak
	public void signUp(Customer customer) {
        if(checkCustomerManager.nameCheck(customer)==true&&checkCustomerManager.lastNameCheck(customer)==true&&checkCustomerManager.ePostaCheck(customer)==true
        		&&checkCustomerManager.passwordCheck(customer)==true&&checkCustomerManager.isUsedEPosta(customer)==false) {
        	System.out.println("customer information is valid");
        	customerDao.add(customer);
        	verifityManager.ePostaVerification(customer);
        	System.out.println("please verify email");
        	verifityManager.isVerified(customer);
        }else {
        	System.out.println("customer information is not valid");
        }
        
        
		
	}

	@Override
	//giriþ yapmak
	public void logIn(Customer customer) {
	     if(customer.getePosta()!=null&&customer.getPassword()!=null) {
	    	 if(checkCustomerManager.trueEpostaPassword(customer)==true) {
	    	 System.out.println("Login successful");
	     }else {
	    	 System.out.println("Login not successful! Wrong password or eposta");
	     }
	
	     }

}
}
