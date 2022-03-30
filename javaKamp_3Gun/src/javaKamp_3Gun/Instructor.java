package javaKamp_3Gun;

public class Instructor extends User {
	
	private int ýnstructorNumber;

	

    public Instructor() {}
	public Instructor(int id, String name, String lastName, String email, String password, int instructorNumber) {
		super(id, name, lastName, email, password);
		ýnstructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return ýnstructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		ýnstructorNumber = instructorNumber;
	}
	

}
