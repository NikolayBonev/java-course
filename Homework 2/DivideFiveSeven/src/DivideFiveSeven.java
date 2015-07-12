import java.util.Scanner;

public class DivideFiveSeven {

	public static void main(String[] args) {
		int inputNum;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter a number: ");
		inputNum=inputs.nextInt();
		
		if((inputNum%5==0)&&(inputNum%7==0)){
			System.out.println("The number " + inputNum + " can be divided with 5 and 7 with out a remander!");
		}
		else{
			System.out.println("The number " + inputNum + " can't be divided with 5 and 7 with out a remander!");
		}
		inputs.close();

	}

}
