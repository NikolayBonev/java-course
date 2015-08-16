import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] data = {6, 3, 9, 2, 4, 21, 0, 5, 10, 3, 9, 4}; 
		
		QuickSort sorter = new QuickSort();
		
		long startTime = System.nanoTime();
		
		System.out.println("Before: " + Arrays.toString(data));
		
		sorter.sort(data);
		
		System.out.println("After:  " + Arrays.toString(data));
		
		long endTime = System.nanoTime();
		
		long totalTime = endTime - startTime;
		
		float millisecond = (float) totalTime / 1000000;
		float second = (float) totalTime / 1000000000;
		
		System.out.println();
		
		System.out.printf("Execution Time: \nnanoseconds: %d \nmilliseconds: %f \nseconds: %.9f", totalTime, millisecond, second);

	}

}
