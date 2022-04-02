package Entity;

public class Offer extends Entity{
       private String offerName;
       private double discountRate;
       
	 public Offer(int id, String offerName, double discountRate) {
		super(id);
		this.offerName = offerName;
		this.discountRate = discountRate;
	 }

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
