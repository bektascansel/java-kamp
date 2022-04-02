package Abstract;

import Entity.Game;
import Entity.Gamer;
import Entity.Offer;

public interface GameService {
	void Add(Game game);
	void Delete(Game game);
	void Sell(Game game,Gamer gamer,Offer offer);
	void Update(Game game,Offer offer);

}
