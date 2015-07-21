import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		System.out.print("Enter size of matrix: ");
		int size=inputs.nextInt();
		
		int[][] spiralMatrix= new int[size][size];
		
		int startR=0;
		int finishR= size-1;
		int startCol=0;
		int finishCol= size-1;
		int p=1;
		
		while(startR<=finishR && startCol<=finishCol){
			
			for(int c=startCol;c<=finishCol;c++){
				spiralMatrix[startR][c]=p++;
			}
			startR++;

			for(int r=startR;r<=finishR;r++){
				spiralMatrix[r][finishCol]=p++;
			}
			
			finishCol--;
			
			for(int r=finishCol;r>=startCol;r--){
				spiralMatrix[finishR][r]=p++;
			}
			
			finishR--;
			
			for(int c=finishR;c>=startR;c--){
				spiralMatrix[c][startCol]=p++;
			}
			
			startCol++;
		}
		
		for(int[] num: spiralMatrix){
			for(int nums: num){
				System.out.printf("%4d", nums);
			}
			System.out.println();
		}
		
		
		
		inputs.close();
	}

}
