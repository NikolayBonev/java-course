import java.util.Scanner;

public class InsColInsRow {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter size of matrix: ");
		int size=inputs.nextInt();
		
		int[][] verHorFill= new int[size][size];
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.printf("Enter element [%d][%d]", i+1,j+1);
				verHorFill[j][i]=inputs.nextInt();
			}
		}
		
		for(int[] nums: verHorFill){
			for(int num: nums){
				System.out.printf("%2d ", num);
			}
			System.out.println();
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.printf("Enter element [%d][%d]", i+1,j+1);
				verHorFill[i][j]=inputs.nextInt();
			}
		}
		
		for(int[] nums: verHorFill){
			for(int num: nums){
				System.out.printf("%2d ", num);
			}
			System.out.println();
		}
		
		inputs.close();

	}

}
