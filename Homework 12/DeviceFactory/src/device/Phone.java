package device;

public class Phone extends Device {

	private short yearRelease;
	
	public Phone() {
		setBrand("");
		setModel("");
		setYearRelease((short) 0);
	}
	
	public Phone(String brand, String model, short yearRelease){
		setBrand(brand);
		setModel(model);
		setYearRelease(yearRelease);
	}

	public short getYearRelease() {
		return this.yearRelease;
	}

	public void setYearRelease(short yearRelease) {
		if(yearRelease >= 0){
			this.yearRelease = yearRelease;
		}
	}
	
	public void printInfo(){
		System.out.printf("Phone:\nBrand: %s\nModel:%s\nYear of release:%d", brand, model, yearRelease);
	}

}
