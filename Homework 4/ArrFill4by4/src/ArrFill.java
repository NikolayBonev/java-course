import java.util.Scanner;

public class ArrFill {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		int[][] matrixFbF = new int[4][4];
		
		for(int i=0;i<4;i++){
			for(int j=0; j<4;j++){
				System.out.printf("Enter element [%d][%d]", i+1,j+1);
				matrixFbF[i][j]=inputs.nextInt();
			}
		}
		
		for(int i=0;i<4;i++){
			for(int j=0; j<4;j++){
				if(matrixFbF[i][j]%2!=0){
					matrixFbF[i][j]=matrixFbF[i][j]*2;
				}
			}
		}
		
		for(int[] nums:matrixFbF){
			for(int num:nums){
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		
		inputs.close();

	}

}
