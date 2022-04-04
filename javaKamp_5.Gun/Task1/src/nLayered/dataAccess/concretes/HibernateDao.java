package nLayered.dataAccess.concretes;

import nLayered.dataAccess.abstracts.CustomerDao;
import nLayered.entities.concretes.Customer;

public class HibernateDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Added with hibernate : "+customer.getName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted with hibernate : "+customer.getName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updateded with hibernate : "+customer.getName());
		
	}

}
