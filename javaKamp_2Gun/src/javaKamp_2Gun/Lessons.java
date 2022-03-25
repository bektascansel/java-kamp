package javaKamp_2Gun;

public class Lessons {
    int id;
    String lessonName;
    int lessonCredit;
    int lessonHour;
    
    
    
    public Lessons(int id,String lessonName,int lessonCredit,int lessonHour) {
   	 super();
   	 this.id=id;
   	 this.lessonName=lessonName;
   	 this.lessonCredit=lessonCredit;
   	 this.lessonHour=lessonHour;
   	 
   	 
    }
    
    public Lessons() {
   	 System.out.println("lesson created");
    }
}
