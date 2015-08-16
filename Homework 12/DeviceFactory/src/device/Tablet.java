package device;

public class Tablet extends Device {

	private float inchDisplay;
	
	public Tablet() {
		setBrand("");
		setModel("");
		setInchDisplay(0);
	}
	
	public Tablet(String brand, String model, float inchDisplay){
		setBrand(brand);
		setModel(model);
		setInchDisplay(inchDisplay);
	}

	public float getInchDisplay() {
		return this.inchDisplay;
	}

	public void setInchDisplay(float inchDisplay) {
		if(inchDisplay >= 0){
			this.inchDisplay = inchDisplay;
		}
	}
	
	@Override
	public void printInfo(){
		System.out.printf("Tablet:\nBrand: %s\nModel:%s\nDisplay:%f", brand, model, inchDisplay);
	}

}
