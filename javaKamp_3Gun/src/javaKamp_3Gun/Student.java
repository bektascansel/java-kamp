package javaKamp_3Gun;

public class Student extends User{
    private String StudentNumber;
    private int classNumber;
    private int LessonNumber;
    private int GPA;
    
	public Student() {}
	
	public Student(int id, String name, String lastName, String email, String password, String studentNumber,
			int classNumber, int lessonNumber, int gPA) {
		super(id, name, lastName, email, password);
		StudentNumber = studentNumber;
		this.classNumber = classNumber;
		LessonNumber = lessonNumber;
		GPA = gPA;
	}
	
	
	
	public String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getLessonNumber() {
		return LessonNumber;
	}
	public void setLessonNumber(int lessonNumber) {
		LessonNumber = lessonNumber;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int gPA) {
		GPA = gPA;
	}
    
    
	
}
