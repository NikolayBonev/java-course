package market;

public class Meat extends Stock{

	private String kindMeat;
	private double fatPer;
	
	public Meat(){
		super();
		
		setKindMeat("");
		setFatPer(0.0);
	}
	
	public Meat(double price, boolean stock, String kindMeat, double fatPer){
		super(price, stock);
		
		setKindMeat(kindMeat);
		setFatPer(fatPer);
	}
	
	public String getKindMeat() {
		return this.kindMeat;
	}
	
	public void setKindMeat(String kindMeat) {
		this.kindMeat = kindMeat;
	}
	
	public double getFatPer() {
		return this.fatPer;
	}
	
	public void setFatPer(double fatPer) {
		this.fatPer = fatPer;
	}
	
	

}
