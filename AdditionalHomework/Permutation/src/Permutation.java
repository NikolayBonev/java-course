import java.util.Scanner;

public class Permutation {

	private static int indexReadyArray = 0;
	
	public static void main(String[] args) {
		
//		int[] array = {3, 12, 8};
		int[] array = null;
		array = fillArray(array);
		
		boolean[] arrayElementUsed = new boolean[array.length];
		int[] readyArray = new int[array.length];
		
		permutation(arrayElementUsed, readyArray, array);
	}
	
	private static void permutation(boolean[] arrayElementUsed, int[] readyArray, int[] array){
		
		for(int i = 0 ; i < array.length ; i++){
			
			if(!isEmpty(arrayElementUsed[i])){
				
				arrayElementUsed[i] = true;
				readyArray[indexReadyArray] = array[i];
				
				if(isReady(arrayElementUsed)){
					printArray(readyArray);
					arrayElementUsed[i] = false;
					return;
				}
				
				indexReadyArray++;
				
				permutation(arrayElementUsed, readyArray, array);
				
				arrayElementUsed[i] = false;
				
				indexReadyArray--;
			}
		}
	}
	
	private static int[] fillArray(int[] array){
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
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
		
		inputs.close();
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
	
	private static boolean isReady(boolean[] arrayElementUsed){
		
		int count = 0;
		
		for(int i = 0 ; i < arrayElementUsed.length; i++){
			
			if(isEmpty(arrayElementUsed[i])){
				count++;
				
				if(count == arrayElementUsed.length){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean isEmpty(boolean arrayElementUsed){
		
		if(arrayElementUsed == false){
			return false;
		}
		
		return true;
	}
}