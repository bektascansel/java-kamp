package javaKamp_3Gun;

public class Instructor extends User {
	
	private int żnstructorNumber;

	

    public Instructor() {}
	public Instructor(int id, String name, String lastName, String email, String password, int instructorNumber) {
		super(id, name, lastName, email, password);
		żnstructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return żnstructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		żnstructorNumber = instructorNumber;
	}
	

}
