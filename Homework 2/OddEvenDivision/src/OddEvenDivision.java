import java.util.Scanner;

public class OddEvenDivision {

	public static void main(String[] args) {
		int num1,num2;
		double remander;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter first number: ");
		num1=inputs.nextInt();
		System.out.print("Enter secound number: ");
		num2=inputs.nextInt();
		
		remander=num1%num2;
		System.out.println("The remander when " + num1 + " divided by " + num2 + " is " + remander);
		
		remander=num2%num1;
		System.out.println("The remander when " + num2 + " divided by " + num1 + " is " + remander);

		
		
	}

}
