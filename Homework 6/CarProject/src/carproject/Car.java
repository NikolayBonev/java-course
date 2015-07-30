package carproject;

public class Car {
	private double price;
	
	public Car(){
		this.price=0.0;
	}
	
	public Car(double price){
		this.price=price;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printPrice(){
		System.out.println("The price of the car is: " + this.price);
	}
}
