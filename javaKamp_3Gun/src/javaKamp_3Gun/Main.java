package javaKamp_3Gun;

public class Main {

	public static void main(String[] args) {
  
        Student student=new Student();
        student.setName("lale");
        student.setLastName("demir");
        
        Instructor żnstructor=new Instructor();
        żnstructor.setName("huseyin");
        żnstructor.setLastName("pehlo");
        
        User [] users= {student,żnstructor};
        UserManager userManager=new UserManager();
        userManager.addMultiple(users, new DatabaseLogger());
        
        
        
        
        
       
        
	}

}
