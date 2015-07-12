import java.util.Scanner;

public class SumOfInts {

	public static void main(String[] args) {
		int a,b,c,d, sum;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter first number: ");
		a=inputs.nextInt();
		System.out.println("Enter secound number: ");
		b=inputs.nextInt();
		System.out.println("Enter third number: ");
		c=inputs.nextInt();
		System.out.println("Enter fourth number: ");
		d=inputs.nextInt();

		sum=a+b+c+d;
		
		System.out.println("The sum of the numbers is: " + sum);
		
		inputs.close();
	}

}
