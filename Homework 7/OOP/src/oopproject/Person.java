package oopproject;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected int workExp;
	static int countInstances=0;
	
	public Person(){
		countInstances++;
		
		setFirstName("");
		setLastName("");
		setWorkExp(0);
	}
	
	public Person(String firstName, String lastName, int workExp){
		this();
		setFirstName(firstName);
		setLastName(lastName);
		setWorkExp(workExp);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getWorkExp() {
		return this.workExp;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setWorkExp(int workExp) {
		if(workExp>0){
			this.workExp = workExp;
		}
	}
	
	
}
