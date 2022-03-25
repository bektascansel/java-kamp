package javaKamp_2Gun;

public class Student {
    String name;
    String surname;
    String studentNumber;
  
    
    public Student(String name,String surname,String studentNumber) {
    	super();
    	this.name=name;
    	this.surname=surname;
    	this.studentNumber=studentNumber;
  
    }
    
    public Student() {
    	System.out.println("student created");
    }
    
}
