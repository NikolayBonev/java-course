import java.util.Scanner;

public class SumEvenArrElem {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		System.out.print("Enter the number of integers: ");
		int numOfInts=inputs.nextInt();
		
		int[] arrNum=new int[numOfInts];

		for(int p=0;p<numOfInts;p++){
			System.out.printf("Enter num %d: ", p+1);
			arrNum[p]=inputs.nextInt();
		}
		
		int sumEven=0;
		for(int i=0;i<arrNum.length;i++){
			if(arrNum[i]%2==0){
				sumEven+=arrNum[i];
			}
		}
		
		System.out.print("The sum of even integers is: " + sumEven);
		
		inputs.close();
	}

}
