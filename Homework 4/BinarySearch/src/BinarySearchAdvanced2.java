import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchAdvanced2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter count of elements: ");
		int numElem=inputs.nextInt();
		
		int[] symArr = new int[numElem];
		
		for(int i=0;i<numElem;i++){
			System.out.printf("Enter element [%d]", i+1);
			symArr[i]=inputs.nextInt();
		}
		
		System.out.print("Before sort: ");
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		Arrays.sort(symArr);
		
		System.out.println();
		System.out.print("After sort: ");
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		System.out.println();
		System.out.print("Enter the value of a element to search for: ");
		int searchElem=inputs.nextInt();
		
		int startElem=0, finishElem=symArr.length,resultId=0;
		while(startElem<=finishElem){
			int midElem=startElem+(finishElem-startElem)/2;
			
			if(searchElem==symArr[midElem]){
				resultId=midElem;
				finishElem=midElem-1;
			}else if(searchElem<symArr[midElem]){
				finishElem=midElem-1;
			}else{
				startElem=midElem+1;
			}
		}
		
		System.out.printf("The index of %d is %d", searchElem,resultId);
		
		inputs.close();



	}

}
