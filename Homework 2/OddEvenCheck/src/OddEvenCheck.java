import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		int oddOrEvenNum;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a number to check if it is odd or even: ");
		oddOrEvenNum=inputs.nextInt();
		
		if(oddOrEvenNum%2==0){
			System.out.println("The number " + oddOrEvenNum + " is even!");
		}
		else{
			System.out.println("The number " + oddOrEvenNum + " is odd!");
		}
		
		inputs.close();

	}

}
