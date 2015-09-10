import java.io.*;

public class Matrix {
	private int size;
	private int[][] matrix;
	private int[][] rotatedMatrix;
	
	public Matrix(int size) {
		setSize(size);
	}

	public int[][] getRotatedMatrix() {
		return this.rotatedMatrix;
	}

	public void setRotatedMatrix(int[][] rotatedMatrix) {
		if(getSize() >= 2 && getSize() <= 9){
			this.rotatedMatrix = rotatedMatrix;
		}
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		if(size >= 2 && size <= 9){
			this.size = size;
		}
	}

	public int[][] getMatrix() {
		return this.matrix;
	}

	public void setMatrix(int[][] matrix) {
		if(matrix.length >= 2 && matrix.length <= 9 ){
			this.matrix = matrix;
		}
	}
	
	public void saveRotatedMatrix(){
		
		rotateMatrixClockwise();
		
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(new File("rotatedMatrix.txt"), true));
			
			for(int i = 0 ; i < getSize() ; i++){
				for(int j = 0 ; j < getSize() ; j++){
					writer.write(this.rotatedMatrix[i][j]+"");
					if(j < getSize() -1){
						writer.write(", ");
					}
				}
				writer.newLine();
			}
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void rotateMatrixClockwise(){
		
		int[][] rotated = new int[getSize()][getSize()];
		
		for(int i = 0 ; i < getSize() ; i++){
			for(int j = 0 ; j < getSize() ; j++){
				rotated[j][getSize() - 1 - i] = this.matrix[i][j];
			}
		}
		
		setRotatedMatrix(rotated);
		
	}
	
	public int sumOfBiggestNumsInMAtrix(){
		
		int biggestInRow;
		int biggestInCol;
		int biggestMainDia = this.matrix[0][0];
		int biggestOtherDia = 0;
		int sum = 0;
		
		for(int i = 0, k = 0; i < getSize() ; i++){
			
			biggestInRow = this.matrix[i][k];
			biggestInCol = this.matrix[k][i];
			
			for(int j = 0 ; j < getSize()-1 ; j++){
				if(biggestInRow < this.matrix[i][j+1]){
					biggestInRow = this.matrix[i][j+1];
				}
				
				if(biggestInCol < this.matrix[j+1][i]){
					biggestInCol = this.matrix[j+1][i];
				}
				
				if(biggestMainDia < this.matrix[i][i]){
					biggestMainDia = this.matrix[i][i];
				}
				
				int swapOtherDia = this.matrix[i][getSize() - 1 - i];
				if(biggestOtherDia < swapOtherDia){
					biggestOtherDia = swapOtherDia;
				}
				
				
			}

			sum = sum + biggestInRow + biggestInCol;			
		}

		sum = sum + biggestMainDia + biggestOtherDia;
		return sum;
	}
}