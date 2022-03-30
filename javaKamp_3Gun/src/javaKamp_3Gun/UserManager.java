package javaKamp_3Gun;

public class UserManager {
	
	public void add(User user,Logger log) {
		System.out.println("user added "+user.getName()+" "+user.getLastName());
		log.log();
	};
	 
	
	
	public void addMultiple(User []users,Logger log) {
		for(User user:users) {
			add(user, log);
		}
	};
	
	public void delete(User user,Logger log) {
		System.out.println("user deleteded "+user.getName()+" "+user.getLastName());
		log.log();
	};
	
	
	
	

}
