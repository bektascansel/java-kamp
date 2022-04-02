package Main;




import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		MernisServiceAdapter mernisServiceAdapter=new MernisServiceAdapter();
		BaseCustomerManager basecustomerManager=new StarBucksCustomerManager(mernisServiceAdapter);
		basecustomerManager.Save(new Customer(1,"cansel", "bektas",1997,"00000000000"));
		
		
		BaseCustomerManager basecustomerManager2=new NeroCustomerManager(new MernisServiceAdapter());
		basecustomerManager2.Save(new Customer(1,"cansel", "bektas",1997,"00000000000"));
     
     
   
     
     
	}

}
