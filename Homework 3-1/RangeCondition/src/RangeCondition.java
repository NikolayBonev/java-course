import java.util.Scanner;

public class RangeCondition {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a number: ");
		int rangeNum= inputs.nextInt();
		
		if(rangeNum>=1 && rangeNum<=5){
			if(rangeNum%2==0){
				System.out.println("The number " + rangeNum + " is even!");
			}else{
				System.out.println("The number " + rangeNum + " is odd!");
			}
		}else if(rangeNum>=6 && rangeNum<=15){
			if(rangeNum%3==0){
				System.out.println("The number " + rangeNum + " can divide without remainder!");
			}else{
				System.out.println("The number " + rangeNum + " can't divide without remainder!");
			}
		}else{
			if(rangeNum==0){
				System.out.println("The number is " + rangeNum);
			}else if(rangeNum>0){
				System.out.println("The number " + rangeNum + " positive!");
			}else{
				System.out.println("The number " + rangeNum + " negative!");
			}
		}
		
		inputs.close();
	}

}
