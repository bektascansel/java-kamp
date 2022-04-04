package nLayered.dataAccess.abstracts;

import nLayered.entities.concretes.Customer;

public interface CustomerDao {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);

}
