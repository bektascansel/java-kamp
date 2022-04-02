package Concrete;

import Abstract.OfferService;
import Entity.Offer;

public class OfferManager implements OfferService{

	@Override
	public void Add() {
		System.out.println("offer added");
		
	}



	@Override
	public void Delete() {
		System.out.println("offer deleteded");
		
	}



	@Override
	public void Update(Offer offer, double discountRate) {
		  offer.setDiscountRate(discountRate);
		  System.out.println("offer updateded");
		
	}



}
