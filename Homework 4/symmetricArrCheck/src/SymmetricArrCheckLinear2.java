import java.util.Scanner;

public class SymmetricArrCheckLinear2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter count of elements: ");
		int numElem=inputs.nextInt();
		
		int[] symArr = new int[numElem];
//		int[]symArr = { 5, 2, 3, 4, 4, 3, 2, 5 }; Test array
		
		for(int i=0;i<numElem;i++){
			System.out.printf("Enter element [%d]", i+1);
			symArr[i]=inputs.nextInt();
		}
		
		boolean symFlag=true;
		
		for(int i=0;i<symArr.length/2;i++){
			if(symArr[i]!=symArr[symArr.length-1-i]){
				symFlag=false;
				break;
			}
		}
		
		if(symFlag==true){
			System.out.println("The matrix is symmetric!");
		}else{
			System.out.println("The matrix is not symmetric!");
		}
		
		inputs.close();

	}

}
