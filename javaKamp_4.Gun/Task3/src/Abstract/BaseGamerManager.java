package Abstract;

import Entity.Gamer;

public abstract class BaseGamerManager implements GamerCheckServise{

	@Override
	public boolean CheckInPerson(Gamer gamer) {
		//sadece simule edildi.
		System.out.println("person checked :"+gamer.getNationalyId()+" "+gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getDateOFBirth()+" ");
		return true;
	}
	
	
	
	
	
	

}
