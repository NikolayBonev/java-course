import java.util.Scanner;

public class OddEvenMethod {

	public static void main(String[] args) {		
		int num;
		
//		num=inputNumber();
		
		num=0;
		OddOfEvenNum(num);    //Even
		
		num=5;
		OddOfEvenNum(num);   //Odd
		
		num=2;
		OddOfEvenNum(num);   //Even

	}
	
	public static int inputNumber() {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a number: ");
		int inputNum = inputs.nextInt();
		
		inputs.close();
		
		return inputNum;
	}
	
	public static void OddOfEvenNum(long number){
		if(number%2==0){
			System.out.println("The number is even!");
			return;
		}
		
		System.out.println("The number is odd!");
		return;
	}

}
