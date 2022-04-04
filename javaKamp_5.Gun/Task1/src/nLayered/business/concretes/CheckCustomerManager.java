package nLayered.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayered.business.abstracts.CheckCustomer;
import nLayered.entities.concretes.Customer;

public class CheckCustomerManager implements CheckCustomer{

	@Override
	public boolean nameCheck(Customer customer) {
		if(customer.getName().length()>=2) {
			return true;
		}else {
		   System.out.println("name not valid");
		   return false;
		   }
	}

	@Override
	public boolean lastNameCheck(Customer customer) {
		if(customer.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("lastName not valid");
			return false;
		}
		
	}

	@Override
	public boolean ePostaCheck(Customer customer) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher=pattern.matcher(customer.getePosta());
	
		return matcher.matches();
	}

	@Override
	public boolean passwordCheck(Customer customer) {
		if(customer.getPassword().length()>=6) {
			return true;
		}else {
			System.out.println("password not valid");
	        return false;
		}
	
	}

	@Override
	public boolean isUsedEPosta(Customer customer) {
	
		return false;
	}

	@Override
	public boolean trueEpostaPassword(Customer customer) {
		
		return true;
	}
	
	

}
