package Main;

import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.OfferManager;
import Entity.Game;
import Entity.Gamer;
import Entity.Offer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1,"cansel","bektas","canl","11111111111",1999);
		Game game=new Game(1,"sims",5000);
		Offer offer=new Offer(1,"StudentRate",50);
		
		GameManager gameManager=new GameManager();
		gameManager.Add(game);
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.Add(gamer);
		
		OfferManager offerManager=new OfferManager();
		offerManager.Add();
		
		gameManager.Sell(game, gamer, offer);
		offerManager.Update(offer, 25);
		gameManager.Sell(game, gamer, offer);
		gameManager.Update(game, offer);
		

	}

}
