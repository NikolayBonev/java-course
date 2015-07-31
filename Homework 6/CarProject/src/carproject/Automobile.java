package carproject;

public class Automobile extends Car{
	
	private double fuelConsump;

	public Automobile(){
		super();
		
		fuelConsump=0.0;
	}
	
	public Automobile(double fuelConsump, double price){
		super(price);
		
		setFuelConsump(fuelConsump);
	}
	
	public double getFuelConsump() {
		return this.fuelConsump;
	}

	public void setFuelConsump(double fuelConsump) {
		this.fuelConsump = fuelConsump;
	}
	
	public void printConsump(){
		System.out.println("The consumption of the car is: " + this.fuelConsump);
	}
}