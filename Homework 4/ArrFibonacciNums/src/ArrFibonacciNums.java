import java.util.Scanner;

public class ArrFibonacciNums {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter the count of fibonacci numbers: ");
		int fibCount=inputs.nextInt();
		
		int[] fibArr = new int[fibCount];
//		long[] fibArr = new long[fibCount];
		
		fibArr[1]=1;
		
		for(int i=2;i<fibCount;i++){
			fibArr[i]=fibArr[i-1]+fibArr[i-2];
		}
		
		for(int nums: fibArr){
			System.out.print(nums + " ");
		}
		
//		for(long nums: fibArr){
//			System.out.print(nums + " ");
//		}
		//0 1 1 2 3 5 8 13 
		inputs.close();
		
	}

}
