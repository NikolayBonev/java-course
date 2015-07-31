package oopproject;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int workExp;
	public int countInstances=0;
	
	public Person(){
		countInstances++;
		
		setFirstName("");
		setLastName("");
		setAge(0);
		setWorkExp(0);
	}
	
	public Person(String firstName, String lastName, int age, int workExp){
		this();
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setWorkExp(workExp);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
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
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWorkExp(int workExp) {
		this.workExp = workExp;
	}
	
	
}
