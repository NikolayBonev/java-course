import java.util.Scanner;

public class MaxNumberOfThree {

	public static void main(String[] args) {

		System.out.print("Enter first number: ");
		int firstNum = inputNumber();
		
		System.out.print("Enter secound number: ");
		int secNum = inputNumber();
		
		System.out.print("Enter third number: ");
		int thrirdNum = inputNumber();
		
		firstNum = maxNumber(firstNum, secNum, thrirdNum);
		
		System.out.println("The bigger number is: " + firstNum);


	}
	
	public static int inputNumber(){
		Scanner inputs = new Scanner(System.in);
		
		int inputNum=inputs.nextInt();

		return inputNum;
	}
	
	public static int maxNumber(int minNum, int maxNum, int midNum){
		
		if(minNum>maxNum){
			return maxNumber(minNum, midNum);
		}
		
		return maxNumber(maxNum, midNum);
	}
	
	public static int maxNumber(int minNum, int maxNum){
		
		if(minNum>maxNum){
			return minNum;
		}
		
		return maxNum;
	}


}
