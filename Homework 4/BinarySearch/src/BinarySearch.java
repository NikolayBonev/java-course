import java.util.Scanner;

public class BinarySearch {

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
		System.out.print("After sort: ");
		for(int nums: symArr){
			System.out.print(nums + " ");
		}
		
		System.out.println();
		System.out.print("Enter the value of a element to search for: ");
		int searchElem=inputs.nextInt();
		
		int startElem=0, finishElem=symArr.length;
		while(startElem<=finishElem){
			int midElem=startElem+(finishElem-startElem)/2;
			
			if(searchElem==symArr[midElem]){
				System.out.printf("The index of %d is %d", searchElem,midElem);
				break;
			}else if(searchElem<symArr[midElem]){
				finishElem=midElem-1;
			}else{
				startElem=midElem+1;
			}
		}
		
		inputs.close();


	}

}
