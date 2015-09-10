import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter size of matrix. It has to be between 2 and 9!");
		
		int size = inputs.nextInt();
		Matrix userMarix = new Matrix(size);
		fillMatrix(inputs, userMarix);
		
		System.out.println("Menu");
		System.out.println("Choose one of the options:\n1. Rotate matrix and save it in file");
		System.out.println("2. Show the sum of biggest numbers in rows, cols, diagonals\n3. Exit");
		
		int choise = inputs.nextInt();
		
		switch (choise) {
		case 1:{
			userMarix.saveRotatedMatrix();
			break;
		}
		case 2:{
			System.out.println("The sum is: " + userMarix.sumOfBiggestNumsInMAtrix());
			break;
		}
		default:
			break;
		}
		
	}
	
	public static void fillMatrix(Scanner inputs, Matrix userMarix){
		
		int i = 0 ; 
		int j = 0;
		
		int[][] swapMatrix = new int[userMarix.getSize()][userMarix.getSize()];
		System.out.println("Please fill the matrix with numbers!");
		
		System.out.print("Enter number: ");
		while(inputs.hasNext()){
			if(inputs.hasNextInt()){
				swapMatrix[i][j] = inputs.nextInt();
				j++;
			}
			
			if(j == swapMatrix.length){
				i++;
				j=0;
			}
			
			if(i == swapMatrix.length){
				break;
			}
			
			System.out.print("Enter number: ");
		}
		
		userMarix.setMatrix(swapMatrix);
	}

}
