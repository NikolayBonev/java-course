package employeeProject;

public class Employee {

	private int workingHoursMonth;
	private int salary;
	
	public Employee(){
		this.workingHoursMonth=0;
		this.salary=0;
	}
	
	public Employee(int salary, int workHours){
		this();
		
		setSalary(salary);
		setWorkingHoursMonth(workHours);
	}
	
	public int getWorkingHoursMonth() {
		return this.workingHoursMonth;
	}
	
	public void setWorkingHoursMonth(int workingHoursMonth) {
		this.workingHoursMonth = workingHoursMonth;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printHoursSalary(){
		System.out.println("The working hours a month are: " + this.workingHoursMonth);
		System.out.println("The working hours a month are: " + this.salary);
	}
	
}
