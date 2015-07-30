package carproject;

public class SUV extends Car{
	
	boolean highly;
	
	public SUV(){
		super();
		
		highly=false;
	}
	
	public SUV(boolean highly, double price){
		super(price);
		
		setHighly(highly);
	}

	public boolean isHighly() {
		return this.highly;
	}

	public void setHighly(boolean highly) {
		this.highly = highly;
	}
	
	public void printHighly(){
		System.out.println("Is off-road SUV: " + this.highly);
	}
}
