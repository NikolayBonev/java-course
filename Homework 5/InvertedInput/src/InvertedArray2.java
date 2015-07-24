
public class InvertedArray2 {

	public static void main(String[] args) {
		int[] numArray = {1, 2, 3 , 4, 5};

		printArray(numArray);
		
		numArray=invertArray(numArray);
		
		printArray(numArray);
	}
	
	public static int[] invertArray(int[] originArr){
		int[] invertedArr = new int[originArr.length];
		for(int i=originArr.length-1;i>=0;i--){
			invertedArr[i] = originArr[originArr.length - i -1];
		}
		
		return invertedArr;
	}
	
	public static void printArray(int[] array){
		for(int num: array){
			System.out.print(" " + num);
		}
		System.out.println();
	}

}
