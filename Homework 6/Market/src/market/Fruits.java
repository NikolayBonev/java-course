package market;

public class Fruits extends Stock{

	private String taste;
	private double waterPer;
	
	public Fruits(){
		super();
		
		setTaste("");
		setWaterPer(0);
	}
	
	public Fruits(double price, boolean stock, String taste, double waterPer){
		super(price, stock);
		
		setTaste(taste);
		setWaterPer(waterPer);
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public double getWaterPer() {
		return this.waterPer;
	}
	
	public void setWaterPer(double waterPer) {
		this.waterPer = waterPer;
	}

}
