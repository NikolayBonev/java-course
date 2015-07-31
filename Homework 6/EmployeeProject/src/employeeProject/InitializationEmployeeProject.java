package employeeProject;

import java.util.Scanner;

public class InitializationEmployeeProject {

	
	
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		classEmployee(inputs);
		
		classDoctor(inputs);
		
		classPoliceman(inputs);
		
		inputs.close();

	}
	
	public static void inputSalaryWorkHours(Scanner inputs, Employee emp){
		System.out.print("Enter the work hours in a month of employee: ");
		int workingHoursMonth = inputs.nextInt();
		
		System.out.print("Enter the salary of employee: ");
		int salary = inputs.nextInt();
		
		emp.setSalary(salary);
		emp.setWorkingHoursMonth(workingHoursMonth);
	}
	
	public static void classPoliceman(Scanner inputs){
		System.out.print("Enter the rank: ");
		String rank = inputs.nextLine();
		
		Policeman petrov = new Policeman();
		inputSalaryWorkHours(inputs, petrov);
		
		petrov.setRankPoliceman(rank);		
		
		petrov.printHoursSalary();
		petrov.printPolicemanRank();
	}
	
	public static void classDoctor(Scanner inputs){
		Doctor docHo = new Doctor();
		
		inputSalaryWorkHours(inputs, docHo);
		
		System.out.print("Enter the number of night shifts: ");
		int nShifts = inputs.nextInt();

		System.out.print("Enter the number of day shifts: ");
		int dShifts = inputs.nextInt();
		
		docHo.setDayShift(dShifts);
		docHo.setNightShift(nShifts);
		
		docHo.printHoursSalary();
		docHo.printShifts();
	}
	
	public static void classEmployee(Scanner inputs){
		Employee george = new Employee();
		
		inputSalaryWorkHours(inputs, george);
		
		george.printHoursSalary();
	}

}
