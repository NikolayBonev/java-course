import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {

		System.out.print("Enter first number: ");
		int maxNum=inputNumber();
		
		System.out.print("Enter secound number: ");
		int minNum=inputNumber();
		
		maxNum=maxNumber(minNum, maxNum);
		
		System.out.println("The bigger number is: " + maxNum);


	}
	
	public static int inputNumber(){
		Scanner inputs = new Scanner(System.in);
		
		int inputNum=inputs.nextInt();

		return inputNum;
	}
	
	public static int maxNumber(int minNum, int maxNum){
		
		if(minNum>maxNum){
			return minNum;
		}
		
		return maxNum;
	}

}
