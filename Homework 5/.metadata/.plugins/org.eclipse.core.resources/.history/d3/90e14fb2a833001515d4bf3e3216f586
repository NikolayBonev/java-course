
public class InvertedArray {

	public static void main(String[] args) {
		int[] numArray = {1, 2, 3 , 4, 5};

		printArray(numArray);
		
		numArray=invertArray(numArray);
		
		printArray(numArray);
	}
	
	public static int[] invertArray(int[] array){
		for(int i=0;i<(array.length-1)/2;i++){
			int swap =array[array.length - i -1];
			array[array.length - i - 1] = array[i];
			array[i]= swap;
		}
		
		return array;
	}
	
	public static void printArray(int[] array){
		for(int num: array){
			System.out.print(" " + num);
		}
		System.out.println();
	}

}
