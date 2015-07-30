import java.util.Random;

public class MultiplicationMethod {

	public static void main(String[] args) {
		Random rand = new Random();
				
		for(int i =0 ; i<20; i++){
			int firstNum=rand.nextInt(100);
			int secNum=rand.nextInt(100);
			int thirdNum=rand.nextInt(100);
			
			int result = multiplicationOfNumbers(firstNum, secNum, thirdNum);
			
			printResult(firstNum, secNum, thirdNum, result);
		}

	}
	
	public static void printResult(int numF, int numS, int numT, int result){
		System.out.printf("First number: %3d  |  Secound number: %3d  |  Third number: %3d  |  Result: %d\n", numF, numS, numT, result);
	}
	
	public static int multiplicationOfNumbers(int firstNum, int secNum){
		return firstNum*secNum;
	}
	
	public static int multiplicationOfNumbers(int firstNum, int secNum, int thirdNum){
		if(firstNum==0 || secNum==0 || thirdNum==0){
			return 0;
		}
		return multiplicationOfNumbers(firstNum*secNum, thirdNum);
	}

}