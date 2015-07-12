import java.util.Scanner;

public class FirmEmployeeInfo {

	public static void main(String[] args) {
		char sex;
		String firstName, lastName;
		short yearsEmployee;
		long EGN;
		int mobileNumber;
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter first name of employee: ");
		firstName=inputs.nextLine();
		System.out.print("Enter last name of employee: ");
		lastName=inputs.nextLine();
		System.out.print("Enter gender of employee (M/F): ");
		sex=inputs.next().charAt(0);
		System.out.print("Enter EGN of employee: ");
		EGN=inputs.nextLong();
		System.out.print("Enter age: ");
		yearsEmployee=inputs.nextShort();
		System.out.print("Enter telephone number: ");
		mobileNumber=inputs.nextInt();
		
		System.out.println("Fist name: " + firstName);
		System.out.printf("Last name: %s\n", lastName);
		System.out.printf("Gender: %c\n", sex);
		System.out.printf("EGN: %d\n", EGN);
		System.out.printf("Age: %d\n", yearsEmployee);
		System.out.printf("Telephone: %d\n", mobileNumber);
		
		inputs.close();
		

	}

}
