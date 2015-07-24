import java.util.Scanner;

public class SumFrom1ToN2 {

	public static void main(String[] args) {
		System.out.print("Enter a number between 10 and 30 000: ");
		int numN = inputNumber();

		int sumN = sumOfIntegers(1, numN);
		System.out.println("The sum of " + numN + " numbers is: " + sumN);

	}
	
	public static int sumOfIntegers(int firstNum, int lastNum){
		
		if(firstNum<lastNum){
			return firstNum + sumOfIntegers(firstNum+1, lastNum);
		}else{
			return lastNum;
		}
	}
	
	public static int inputNumber() {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		int inputNum=0;
		
		
		while(inputs.hasNextInt()){
			
			inputNum = inputs.nextInt();
			
			if(inputNum>=10 && inputNum<=30000){
				break;
			}
			
			System.out.print("Invalid number!\nEnter a number between 10 and 30 000: ");
		}
		
		inputs.close();
		
		return inputNum;
	}

}
