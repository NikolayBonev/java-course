package employeeProject;

public class Doctor extends Employee{
	
	private int nightShift;
	private int dayShift;
	
	public Doctor(){
		this.nightShift=0;
		this.dayShift=0;
	}
	
	public Doctor(int nightShift, int dayShift, int salary, int workHours){
		super(salary,workHours);
		
		setNightShift(nightShift);
		setDayShift(dayShift);
	}
	
	public int getNightShift() {
		return this.nightShift;
	}
	
	public void setNightShift(int nightShift) {
		this.nightShift = nightShift;
	}
	
	public int getDayShift() {
		return this.dayShift;
	}
	
	public void setDayShift(int dayShift) {
		this.dayShift = dayShift;
	}
	
	public void nightShifts(){
		System.out.println("The number of night shifts are: " + this.nightShift);
	}
	
	public void dayShifts(){
		System.out.println("The number of day shifts are: " + this.dayShift);
	}
	
	public void printShifts(){
		nightShifts();
		dayShifts();
	}

}
