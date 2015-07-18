/*
 * The code in commenting lines for real numbers.
 * If you want the program to work with real numbers you have to uncomment the commenting lines
 * and comment the the lines for integers.
 */

import java.util.Scanner;

public class SumOfNums2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		int sumOfNums=0 , inputNum=0;
//		double sumOfNums=0.0 , inputNum=0.0;
		
		do{
			System.out.print("Enter a number: ");
			
			if(inputs.hasNextInt()){
//			if(inputs.hasNextDouble()){
				inputNum=inputs.nextInt();
//				inputNum=inputs.nextDouble();
				
				if(inputNum==0){
//				if(inputNum==0.0){
					break;
				}else{
					sumOfNums+=inputNum;
				}
			}else{
				System.out.print("Invalid value!");
				inputs.nextLine();
			}
		}while(true);
		
		System.out.print("The sum of numbers is: " + sumOfNums);
		
		inputs.close();

	}

}
