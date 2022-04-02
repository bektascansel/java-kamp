package Concrete;

import Abstract.BaseCustomerManager;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {
     
	
	private ICustomerCheckService customerCheckService;
	

	public StarBucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	
	
	@Override
	 public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			Save(customer);
		}
		else {
			System.out.println("geçerli bir kiþi deðildir.");
		}
		
		 
	}



	
	
	

}
