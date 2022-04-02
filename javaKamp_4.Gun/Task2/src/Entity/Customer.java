package Entity;



public class Customer {

	public int id;
	public String firstName;
	public String lastName;
	public int dateoFBirth;
	public String nationalityId;
	
	
	
	public Customer(int id, String firstName, String lastName, int i, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateoFBirth = i;
		this.nationalityId = nationalityId;
	}
	
	
	
	public Customer() { 
    
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateoFBirth() {
		return dateoFBirth;
	}
	public void setDateoFBirth(int dateoFBirth) {
		this.dateoFBirth = dateoFBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
