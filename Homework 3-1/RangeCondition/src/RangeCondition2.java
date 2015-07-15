import java.util.Scanner;

public class RangeCondition2 {

	public static void main(String[] args) {
Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter a number: ");
		int rangeNum= inputs.nextInt();
		
		switch (rangeNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			if(rangeNum%2==0){
				System.out.println("The number " + rangeNum + " is even!");
			}else{
				System.out.println("The number " + rangeNum + " is odd!");
			}
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			if(rangeNum%3==0){
				System.out.println("The number " + rangeNum + " can divide without remainder!");
			}else{
				System.out.println("The number " + rangeNum + " can't divide without remainder!");
			}
			break;
		default:
			if(rangeNum==0){
				System.out.println("The number is " + rangeNum);
			}else if(rangeNum>0){
				System.out.println("The number " + rangeNum + " positive!");
			}else{
				System.out.println("The number " + rangeNum + " negative!");
			}
			break;
		}

	}

}
