package market;

public class Drinks extends Stock{
	
	private String  alcoholPer;
	private double carbonatePer;
	
	public Drinks(){
		super();
		
		setAlcoholPer("");
		setCarbonate(0.0);
	}
	
	public Drinks(double price, boolean stock, String alcoholPer, double carbonatePer){
		super(price, stock);
		
		setAlcoholPer(alcoholPer);
		setCarbonate(carbonatePer);
	}
	
	public String getAlcoholPer() {
		return this.alcoholPer;
	}
	
	public void setAlcoholPer(String alcoholPer) {
		this.alcoholPer = alcoholPer;
	}
	
	public double getCarbonate() {
		return this.carbonatePer;
	}
	
	public void setCarbonate(double carbonatePer) {
		this.carbonatePer = carbonatePer;
	}

}
