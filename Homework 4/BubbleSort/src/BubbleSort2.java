import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter count of elements: ");
		int numElem=inputs.nextInt();
		
		int[] symArr = new int[numElem];
		
		for(int i=0;i<numElem;i++){
			System.out.printf("Enter element [%d]", i+1);
			symArr[i]=inputs.nextInt();
		}
		
		System.out.print("Before bubble sort: ");
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		for(int i=0,newSwap=symArr.length-1;i<symArr.length;i++){
			
			int oldSwap=0;
			
			for(int j=1;j<=newSwap;j++){
				if(symArr[j-1]>symArr[j]){
					oldSwap=symArr[j-1];
					symArr[j-1]=symArr[j];
					symArr[j]=oldSwap;
					oldSwap=j;
				}
			}
			
			newSwap=oldSwap-1;	
		}
		
		System.out.println();
		System.out.print("After bubble sort: ");
		
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		inputs.close();
	}

}