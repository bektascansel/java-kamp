package javaKamp_2Gun;

import javaKamp_2Gun.Lessons;
import javaKamp_2Gun.Student;
import javaKamp_2Gun.StudentManager;

public class Main {
	
	
	
	public static void main(String[] args) {
	
	Student student1=new Student("ali","yýldýrým","258963");
	Student student2=new Student("ayþe","yýldýz","214875");
	
	Lessons lesson1=new Lessons(1,"maths",6,8);
	Lessons lesson2=new Lessons(2,"physical",7,9);
	
	
	
	Student [] students= {student1,student2};
    Lessons [] lessons= {lesson1,lesson2};
	
	
	
	for(Student student:students) {
		System.out.println(student.name+" "+student.surname+" "+student.studentNumber);
	}
	
	for(Lessons lesson:lessons) {
		System.out.println(lesson.id+" "+lesson.lessonName+" "+lesson.lessonCredit+" "+lesson.lessonHour);
	}
	
	
	
	StudentManager studentManager=new StudentManager();
	studentManager.add(student1,lesson2);
	studentManager.delete(student2,lesson1);
	

	
}
}