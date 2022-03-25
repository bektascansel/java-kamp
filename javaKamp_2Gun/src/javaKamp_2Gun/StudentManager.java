package javaKamp_2Gun;

import javaKamp_2Gun.Lessons;
import javaKamp_2Gun.Student;

public class StudentManager {
	
	public void add(Student student,Lessons lesson) {
		
		System.out.println(student.studentNumber+"  "+student.name+" "+student.surname+" ADDED "+lesson.lessonName);
		
	}
	
	public void delete(Student student,Lessons lesson) {
		
		System.out.println(student.studentNumber+"  "+student.name+" "+student.surname+" DELETED "+lesson.lessonName);
		
	}
	

}
