import java.util.Scanner;

public class BiggestOfThree2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		int firstnumCompare, secoundnumCompare, thirdnumCompare;
		
		System.out.print("Enter fist number for compare: ");
		firstnumCompare=inputs.nextInt();
		System.out.print("Enter secound number for compare: ");
		secoundnumCompare=inputs.nextInt();
		System.out.print("Enter third number for compare: ");
		thirdnumCompare=inputs.nextInt();
		
		if(firstnumCompare>=secoundnumCompare){
			if(firstnumCompare==secoundnumCompare && secoundnumCompare==thirdnumCompare){
				System.out.print("All the numbers are even: " + firstnumCompare);
			}else if(firstnumCompare>thirdnumCompare && firstnumCompare>secoundnumCompare){
				System.out.print("The number " + firstnumCompare + " is the biggest!" );
				if(secoundnumCompare==thirdnumCompare){
					System.out.print("The secound and third number are even and smaller than the first" );
				}
			}else if(firstnumCompare>thirdnumCompare && firstnumCompare==secoundnumCompare){
				System.out.print("The number " + firstnumCompare + " is the biggest!" );
				System.out.print("The first and secound number are even and bigger than the third" );
			}else{
				System.out.print("The number " + thirdnumCompare + " is the biggest!" );
				if(secoundnumCompare==firstnumCompare){
					System.out.print("The first and secound number are even and smaller than the third" );
				}
			}
		} else if (firstnumCompare<secoundnumCompare){
			if(secoundnumCompare>thirdnumCompare){
				System.out.print("The number " + secoundnumCompare + " is the biggest!" );
				if(firstnumCompare==thirdnumCompare){
					System.out.print("The first and third number are even and smaller than the secound" );
				}
			}else{
				System.out.print("The number " + thirdnumCompare + " is the biggest!" );
			}
		}
		
		inputs.close();

	}

}