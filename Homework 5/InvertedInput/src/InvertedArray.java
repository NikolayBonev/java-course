
public class InvertedArray {

	public static void main(String[] args) {
		int[] numArray = {1, 2, 3 , 4, 5};

		printArray(numArray);
		
		invertArray(numArray);
		
		printArray(numArray);
	}
	
	public static void invertArray(int[] array){
		for(int i=0;i<(array.length-1)/2;i++){
			int swap =array[array.length - i -1];
			array[array.length - i - 1] = array[i];
			array[i]= swap;
		}
	}
	
	public static void printArray(int[] array){
		for(int num: array){
			System.out.print(" " + num);
		}
		System.out.println();
	}

}
