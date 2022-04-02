package Concrete;
import Abstract.BaseGamerManager;
import Abstract.GamerSevice;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager implements GamerSevice{

	@Override
	public void Add(Gamer gamer) {
		if(CheckInPerson(gamer)) {
		System.out.println("gamer added");
	   }else {
		   System.out.println("this person is not real");
	   }
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("gamer updateded");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("gamer deleteded ");
		
	}
      
	
}
