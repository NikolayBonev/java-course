package employeeProject;

public class Policeman extends Employee{
	
	private String rankPoliceman;

	public Policeman(){
		super();
		
		this.rankPoliceman="";
	}
	
	public Policeman(int salary, int workHours, String rankPoliceman){
		super(salary,workHours);
		
		setRankPoliceman(rankPoliceman);		
	}
	
	public String getRankPoliceman() {
		return this.rankPoliceman;
	}

	public void setRankPoliceman(String rankPoliceman) {
		this.rankPoliceman = rankPoliceman;
	}

	public void printPolicemanRank(){
		System.out.println("The rank of policeman is : " + this.rankPoliceman);
	}

	
}
