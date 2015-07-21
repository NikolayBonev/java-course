import java.util.Scanner;

public class FirstInArr {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter the count of elements:");
		int size = inputs.nextInt();

		int[] arrSearch = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.printf("Enter the element[%d]: " ,i);
			arrSearch[i] = inputs.nextInt();
		}

		System.out.print("Enter the number to find:");
		int numSearch=inputs.nextInt();
		
		for (int i = 0; i < size; i++) {
			if(arrSearch[i] == numSearch){
				System.out.println(numSearch + " is at index " + i);
				break;				
			}
		}
			
		inputs.close();

	}

}
