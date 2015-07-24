import java.util.Scanner;

public class FactorialRecuesive {

	public static void main(String[] args) {
		System.out.print("Factorial from number: ");
		int num=inputNumber();
		
		int factNum=factorialCalculation(1, num);
		
		System.out.println("Factoriel of !" + num + " is " + factNum);

	}
	
	public static int factorialCalculation(int firstNum, int lastNum){
		if(firstNum<lastNum){
			return firstNum*factorialCalculation(firstNum+1, lastNum);
		}else{
			return lastNum;
		}
	}
	
	public static int inputNumber() {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		int inputNum = inputs.nextInt();
		
		inputs.close();
		
		return inputNum;
	}

}
