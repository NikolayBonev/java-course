import java.util.Scanner;

public class SumOfInts2 {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter first number: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.println("Enter secound number: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.println("Enter third number: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.println("Enter fourth number: ");
		num=inputs.nextInt();
		sum+=num;
		
		System.out.println("The sum of the numbers is: " + sum);
		
		inputs.close();
	}

}
