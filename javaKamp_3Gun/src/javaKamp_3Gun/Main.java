package javaKamp_3Gun;

public class Main {

	public static void main(String[] args) {
  
        Student student=new Student();
        student.setName("lale");
        student.setLastName("demir");
        
        Instructor ınstructor=new Instructor();
        ınstructor.setName("huseyin");
        ınstructor.setLastName("pehlo");
        
        User [] users= {student,ınstructor};
        UserManager userManager=new UserManager();
        userManager.addMultiple(users, new DatabaseLogger());
        
        
        
        
        
       
        
	}

}
