import java.util.*;

public class GoodNumbers {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("This program is for searching good numbers!");
		System.out.print("Enter how many numbers will be even of the seached numbers:");
		
		
		int countEven = inputs.nextInt();
		int[] evenNums =new int[countEven];
		fillArray(evenNums, countEven, inputs);
		
		System.out.print("Enter how many numbers will be odd of the seached numbers:");
		
		int countOdd = inputs.nextInt();
		int[] oddNums =new int[countOdd];
		fillArray(oddNums, countOdd, inputs);
		
		System.out.print("Enter range of numbers [1....N]:");
		
		int range = inputs.nextInt();
		List<Integer> foundNumbers = new ArrayList<Integer>();
		
		try{
		
		for(int j = 0; j < countEven ; j++){
			findGoodNumbers(foundNumbers, evenNums[j], oddNums[j], range);
		}
		
		Collections.sort(foundNumbers);
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The number of odd and even numbers have to equal!");
		}finally {
			System.out.println(foundNumbers);
		}
		

	}
	
	public static void fillArray(int[] array, int range, Scanner inputs){
		for(int i = 0 ; i < range ; i++){
			System.out.print("Enter the number:");
			array[i] = inputs.nextInt();
		}
	}
	
	public static void findGoodNumbers(List<Integer> list, int evenNum, int oddNum, int range){
		
		for(int i = 1 ; i <= range ; i++){
			if(i%evenNum == 0){
				if(i%oddNum != 0){
					list.add(i);
				}
			}
		}
		
	}

}
