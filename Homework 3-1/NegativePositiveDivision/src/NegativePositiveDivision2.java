import java.util.Scanner;

public class NegativePositiveDivision2 {

	public static void main(String[] args) {
Scanner inputs = new Scanner(System.in , "UTF-8");
		
		double numDivided,numDivider;
		
		System.out.print("Enter the number which will be divided: ");
		numDivided = inputs.nextDouble();
		System.out.print("Enter the number with which we will divide: ");
		numDivider = inputs.nextDouble();
		
		if(numDivider==0){ //Check if divider is zero
			System.out.println("Can't divide by Zero!");
		} else if(numDivider>0.0){
			if(numDivided>0.0){
				System.out.println(" + ");
			}else{
				System.out.println(" - ");
			}
		}else if(numDivider<0.0){
			if(numDivided>0.0){
				System.out.println(" - ");
			}else{
				System.out.println(" + ");
			}
		}else {
			System.out.println(" 0 ");
		}
		
		inputs.close();

	}

}
