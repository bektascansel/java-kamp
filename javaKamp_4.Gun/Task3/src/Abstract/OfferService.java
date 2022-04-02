package Abstract;

import Entity.Offer;

public interface OfferService {

	void Add();
	void Update(Offer offer,double discountRate);
	void Delete();
}
