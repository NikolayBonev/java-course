package market;

public class Vegetables extends Stock{

	private String color;
	private double size;
	
	public Vegetables(){
		super();
		
		setColor(null);
		setSize(0);
	}
	
	public Vegetables(double price, boolean stock, String color, double size){
		super(price, stock);
		
		setColor(color);
		setSize(size);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}

}
