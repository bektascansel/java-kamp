package Entity;

public class Gamer extends Entity{
	
	private String firstName;
	private String lastName;
	private String userName;
	private String NationalyId;
	private int dateOFBirth;
	

	
	public Gamer(int id, String firstName, String lastName,String userName, String nationalyId, int dateOFBirth) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName=userName;
		NationalyId = nationalyId;
		this.dateOFBirth = dateOFBirth;
	}

	public Gamer() {
		
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

	public String getNationalyId() {
		return NationalyId;
	}

	public void setNationalyId(String nationalyId) {
		NationalyId = nationalyId;
	}

	public int getDateOFBirth() {
		return dateOFBirth;
	}

	public void setDateOFBirth(int dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	

}
