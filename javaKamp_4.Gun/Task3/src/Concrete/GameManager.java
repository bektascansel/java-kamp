package Concrete;

import Abstract.GameService;
import Entity.Game;
import Entity.Gamer;
import Entity.Offer;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println("game added");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("game deleteded");
		
	}

	@Override
	public void Sell(Game game, Gamer gamer,Offer offer) {
		System.out.println("game sold: "+gamer.getUserName()+" with: "+offer.getOfferName());
		
	}

	@Override
	public void Update(Game game,Offer offer) {
      game.setPriceAfterDiscount(offer);
	}

}
