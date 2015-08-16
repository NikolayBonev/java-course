import java.util.*;

/*		This version works with JVM version 8 and above!
 * 		
 * 		Calculated on Toshiba Satellite c660-1m6
 * 
 *      1000 for 0,19 seconds
 *     10000 for 0,23 seconds
 * 	  100000 for 0,41 seconds
 * 	 1000000 for 1,15 seconds
 *  10000000 for 14-15 seconds
 */

public class SortOddEven {

	public static void main(String[] args) {

		Random rand = new Random();
		int size = 10;
		
		int[] numArr = new int[size];
		
		for(int i = 0; i < size ; i++){
			numArr[i] = rand.nextInt(1000);
		}
		
		List<Integer> evenNums = new ArrayList<Integer>();
		List<Integer> oddNums = new ArrayList<Integer>();
		
		long startTime = System.nanoTime();
		
		addNumsInLists(evenNums, oddNums, numArr);
		
		sortNums(evenNums, oddNums);
		
		int[] evenNum = listToArray(evenNums);
		int[] oddNum = listToArray(oddNums);
		
		long endTime = System.nanoTime();
		
		long totalTime = endTime - startTime;
		
		float millisecond = (float) totalTime / 1000000;
		float second = (float) millisecond / 1000;
		
		printArray(numArr);
		printArray(evenNum);
		printArray(oddNum);
		
		System.out.printf("Execution Time: \nnanoseconds: %d \nmilliseconds: %f \nseconds: %.9f", totalTime, millisecond, second);
	}
	
	public static int[] listToArray(List<Integer> listNums){
		int[] numbers = listNums.stream().mapToInt(i -> i).toArray();
		
		return numbers;
	}
	
	public static void printArray(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void addNumsInLists(List<Integer> evenNums, List<Integer> oddNums, int numArr[] ){
		for(int i = 0 ; i < numArr.length ; i++){
			if(numArr[i]%2 == 0){
				evenNums.add(numArr[i]);
			}else{
				oddNums.add(numArr[i]);
			}
		}
	}
	
	public static void sortNums(List<Integer> evenNums, List<Integer> oddNums){
		Collections.sort(evenNums);
		Collections.sort(oddNums);
		Collections.reverse(oddNums);
	}

}