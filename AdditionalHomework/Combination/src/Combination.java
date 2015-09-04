import java.util.Scanner;

public class Combination {
	
	private static int indexReadyArray = 0;
	
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in,"UTF-8");
		
		int[] array = {3, 6, 7, 8};
//		int[] array = null;
//		array = fillArray(array, inputs);
		
		System.out.print("The count of numbers for combination: ");
		int count = inputs.nextInt();
		
		int[] readyArray = new int[count];
		
		permutation(readyArray, array, 0);
		
		inputs.close();
	}
	
	private static void permutation(int[] readyArray, int[] array, int index){
		
		for(int i = index ; i < array.length  ; i++){
			
				readyArray[indexReadyArray] = array[i];
				
				if(indexReadyArray == readyArray.length -1){
					printArray(readyArray);
					
				}
				
				if(indexReadyArray < readyArray.length-1 && (i != array.length-1)){
					indexReadyArray++;
				
					permutation(readyArray, array, i+1);
					
					indexReadyArray--;
				}
				
		}
	}
	
	private static int[] fillArray(int[] array, Scanner inputs){	
		System.out.print("Enter count of numbers for the permutation: ");
		
		int count = inputs.nextInt();
		
		array = new int[count];
		int i = 0;
		
		do{
			System.out.print("Enter a number: ");
			
			if(inputs.hasNextInt()){
				array[i] = inputs.nextInt();
				i++;
			}else{
				System.out.println("Enter a number please!");
			}
			
		}while(i != count);

		return array;
	}
	
	private static void printArray(int[] readyArray){
		
		System.out.print("{");
		
		for(int i = 0 ; i < readyArray.length ; i++){
			System.out.printf("%2d",readyArray[i]);
			
			if(i != readyArray.length-1){
				System.out.print(", ");
			}
		}
		
		System.out.print("}");
		System.out.println();
	}
}
