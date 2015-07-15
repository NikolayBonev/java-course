import java.util.Scanner;

public class PosibleTriangle {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter first number: ");
		int firstnumTriangle=inputs.nextInt();
		System.out.print("Enter secound number: ");
		int secoundnumTriangle=inputs.nextInt();
		System.out.print("Enter third number: ");
		int thirdnumTriangle=inputs.nextInt();
		
		if(firstnumTriangle<(secoundnumTriangle+thirdnumTriangle) && secoundnumTriangle<(firstnumTriangle+thirdnumTriangle) && thirdnumTriangle<(firstnumTriangle+secoundnumTriangle)){
			System.out.println("Yes we can make a triangle with sides: " + firstnumTriangle + " " + secoundnumTriangle + " " + thirdnumTriangle);
		}else{
			System.out.println("No, we can't make a triangle with sides: " + firstnumTriangle + " " + secoundnumTriangle + " " + thirdnumTriangle);
		}
		
		inputs.close();

	}

}
