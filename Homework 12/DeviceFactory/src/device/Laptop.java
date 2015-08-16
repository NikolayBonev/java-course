package device;

public class Laptop extends Device{

	private String processorModel;
	
	public Laptop() {
		setBrand("");
		setModel("");
		setProcessorModel("");
	}
	
	public Laptop(String brand, String model, String processorModel){
		setBrand(brand);
		setModel(model);
		setProcessorModel(processorModel);
	}

	public String getProcessorModel() {
		return this.processorModel;
	}

	public void setProcessorModel(String processorModel) {
		this.processorModel = processorModel;
	}
	
	public void printInfo(){
		System.out.printf("Laptop:\nBrand: %s\nModel:%s\nModel of processor:%s", brand, model, processorModel);
	}

}
