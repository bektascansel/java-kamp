package javaKamp_3Gun;

public class Instructor extends User {
	
	private int �nstructorNumber;

	

    public Instructor() {}
	public Instructor(int id, String name, String lastName, String email, String password, int instructorNumber) {
		super(id, name, lastName, email, password);
		�nstructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return �nstructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		�nstructorNumber = instructorNumber;
	}
	

}
