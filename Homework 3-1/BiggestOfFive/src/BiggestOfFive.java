import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter first number: ");
		double firstNumComp = inputs.nextDouble();
		System.out.print("Enter secound number: ");
		double secoundNumComp = inputs.nextDouble();
		
		if(secoundNumComp>firstNumComp){
			firstNumComp = firstNumComp + secoundNumComp;
			secoundNumComp = firstNumComp - secoundNumComp;
			firstNumComp = firstNumComp - secoundNumComp;
		}
		
		System.out.print("Enter Third number: ");
		double thirdNumComp = inputs.nextDouble();
		System.out.print("Enter fourth number: ");
		double fourthNumComp = inputs.nextDouble();
		
		if(fourthNumComp>thirdNumComp){
			thirdNumComp = thirdNumComp + fourthNumComp;
			fourthNumComp = thirdNumComp - fourthNumComp;
			thirdNumComp = thirdNumComp - fourthNumComp;
		}
		
		System.out.print("Enter fifth number: ");
		double fifthNumComp = inputs.nextDouble();
		
		if(fifthNumComp>thirdNumComp){
			thirdNumComp = thirdNumComp + fifthNumComp;
			fifthNumComp = thirdNumComp - fifthNumComp;
			thirdNumComp = thirdNumComp - fifthNumComp;
		}
		
		if(firstNumComp>thirdNumComp){
			System.out.println("The biggest number is: " + firstNumComp);
		}
		else{
			System.out.println("The biggest number is: " + thirdNumComp);
		}

	}

}
