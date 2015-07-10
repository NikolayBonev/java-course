//Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 
//без остатък. Изведете резултатът.

import java.util.Scanner;

public class DivideFiveSeven {

	public static void main(String[] args) {
		int inputNum;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Въведи число: ");
		//System.out.println("Enter a number: ");
		inputNum=inputs.nextInt();
		
		if((inputNum%5==0)&&(inputNum%7==0)){
			System.out.println("Числото " + inputNum + " се дели на 5 и 7 без остатък!");
			//System.out.println("The number " + inputNum + " can be divided with 5 and 7 with out a remander!");
		}
		else{
			System.out.println("Числото " + inputNum + " не се дели на 5 и 7 без остатък!");
			//System.out.println("The number " + inputNum + " can't be divided with 5 and 7 with out a remander!");
		}
		inputs.close();

	}

}
