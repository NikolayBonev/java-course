import java.util.Scanner;

public class Permutation2 {
	private static int counter = 0;

	private static void permutation(int[] array, int startIndex) {
	    	
		int size = array.length;

	    if (size == startIndex + 1) {
	        	
	    	System.out.print("Permutation " + (counter + 1) + " is  ");
	            
	        printArray(array);
	            
	        counter++;
	        
	    } else {
	        	
	    	for (int i = startIndex; i < size; i++) {

	    		int[] in = array.clone();
	                
	            int temp = in[i];
	            in[i] = in[startIndex];
	            in[startIndex] = temp;
	                
	            permutation(in, startIndex + 1);
	        }
	    }
	}
	
	private static void printArray(int[] array){
		
		System.out.print("{");
		
		for(int i = 0 ; i < array.length ; i++){
			System.out.printf("%2d",array[i]);
			
			if(i != array.length-1){
				System.out.print(", ");
			}
		}
		
		System.out.print("}");
		System.out.println();

	}

	public static void main(String[] args) {
		
	    int[] array = null;
	    
	    array = fillArray(array);
	    
	    permutation(array, 0);
	    
	    System.out.println("Number of permutations: " + counter);

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
}