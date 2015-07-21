
public class Insert30to1back {

	public static void main(String[] args) {
		int maxRow=5,maxCol=6;
		int[][] elArr = new int[maxRow][maxCol];
		
		for(int i=0;i<maxRow;i++){
			for(int j=0;j<maxCol;j++){
				elArr[i][j]=1+j+6*i;
			}
		}
		
		for(int[] numR:elArr){
			for(int numC: numR){
				System.out.printf("%3d", numC);
			}
			System.out.println();
		}
		
	}

}
