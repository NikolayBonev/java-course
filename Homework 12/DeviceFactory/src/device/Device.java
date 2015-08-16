package device;

public abstract class Device {

	protected String model;
	protected String brand;

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void printInfo(){
		System.out.println("Device");
	}

}
