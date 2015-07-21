import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0;i<symArr.length;i++){
			
			boolean noSortFlag=false;
			
			for(int j=1;j<=(symArr.length-1 - i);j++){
				if(symArr[j-1]>symArr[j]){
					int swap=symArr[j-1];
					symArr[j-1]=symArr[j];
					symArr[j]=swap;
					noSortFlag=true;
				}
			}
			
			if(!noSortFlag){
				break;
			}
			
		}
		
		System.out.println();
		System.out.print("After bubble sort: ");
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		inputs.close();


	}

}
