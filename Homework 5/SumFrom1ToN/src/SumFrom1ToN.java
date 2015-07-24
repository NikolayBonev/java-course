import java.util.Scanner;

public class SumFrom1ToN {

	public static void main(String[] args) {
		System.out.print("Enter a number between 10 and 30 000: ");
		int numN=inputNumber();

		int sumN=sumOfIntegers(numN);
		
		System.out.println("The sum of " + numN +  " numbers is: " + sumN);

	}
	
	public static int sumOfIntegers(int num){
		
		if(num>1){
			return num + sumOfIntegers(num-1);
		}else{
			return 1;
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
