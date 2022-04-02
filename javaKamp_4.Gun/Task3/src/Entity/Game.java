package Entity;

public class Game extends Entity{
        private String gameName;
        private double price;
        private double priceAfterDiscount;
		
		public Game(int id, String gameName, double price) {
			super(id);
			this.gameName = gameName;
			this.price = price;
		}
		public String getGameName() {
			return gameName;
		}
		public void setGameName(String gameName) {
			this.gameName = gameName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
        
        public double getPriceAfterDiscount() {
			return priceAfterDiscount;
		}
        
        public void setPriceAfterDiscount(Offer offer) {
        	priceAfterDiscount=price-(price*offer.getDiscountRate()/100);
        }
        
	
}
