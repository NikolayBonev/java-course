
public class Town {
	private String townName;
	private String townCountry;
	private int population;
	
	public Town(){
		setTownName("");
		setTownCountry("");
		setPopulation(0);
	}
	
	public Town(String townName, String townCountry, int population){
		setTownName(townName);
		setTownCountry(townCountry);
		setPopulation(population);
	}
	
	public String getTownName() {
		return this.townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getTownCountry() {
		return this.townCountry;
	}
	public void setTownCountry(String townCountry) {
		this.townCountry = townCountry;
	}
	public int getPopulation() {
		return this.population;
	}
	public void setPopulation(int population) {
		if(population>=0){
			this.population = population;
		}
	}
	
	@Override
	public int hashCode() {
		 return (this.townName + this.townCountry + this.population).hashCode();
    }
	
	@Override
	public boolean equals(Object object) {
		if (this == object){
			return true;
		}
		
		if (object == null || getClass() != object.getClass()){
			return false;
		}
		
		Town newTown = (Town) object;
		if (townCountry == null) {
			if (newTown.townCountry != null)
				return false;
		} else if (!townCountry.equals(newTown.townCountry))
			return false;
		if (townName == null) {
			if (newTown.townName != null)
				return false;
		} else if (!townName.equals(newTown.townName)){
			return false;
		} 
		
		if (population != newTown.population){
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s %d", this.townName,this.townCountry,this.population);
	}
}
