package market;

public abstract class Stock {
	
	private double price;
	private boolean stock;
	private int countElem=0;
	
	public Stock(){
		countElem++;
		setPrice(0.0);
		setStock(false);
	}
	
	public Stock(double price, boolean stock){
		setPrice(price);
		setStock(stock);
	}
	
	public int getCountElem(){
		return this.countElem;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isStock() {
		return this.stock;
	}
	
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
}