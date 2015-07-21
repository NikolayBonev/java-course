import java.util.Scanner;

public class InsColInsRowAuto2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter size of matrix: ");
		int sizeMatrix=inputs.nextInt();
		
		int[][] verHorFill= new int[sizeMatrix][sizeMatrix];
		
		for(int i=0;i<sizeMatrix;i++){
			for(int j=0;j<sizeMatrix;j++){
				verHorFill[i][j]=1+i+sizeMatrix*j;
			}
		}
		
		for(int[] nums: verHorFill){
			for(int num: nums){
				System.out.printf("%2d ", num);
			}
			System.out.println();
		}
		
		for(int i=0;i<sizeMatrix;i++){
			for(int j=0;j<sizeMatrix;j++){
				verHorFill[j][i]=1+i+sizeMatrix*j;
			}
		}
		
		System.out.println();
		
		for(int[] nums: verHorFill){
			for(int num: nums){
				System.out.printf("%2d ", num);
			}
			System.out.println();
		}
		
		inputs.close();



	}

}