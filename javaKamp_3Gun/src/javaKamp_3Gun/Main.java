package javaKamp_3Gun;

public class Main {

	public static void main(String[] args) {
  
        Student student=new Student();
        student.setName("lale");
        student.setLastName("demir");
        
        Instructor �nstructor=new Instructor();
        �nstructor.setName("huseyin");
        �nstructor.setLastName("pehlo");
        
        User [] users= {student,�nstructor};
        UserManager userManager=new UserManager();
        userManager.addMultiple(users, new DatabaseLogger());
        
        
        
        
        
       
        
	}

}
