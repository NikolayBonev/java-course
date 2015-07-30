import java.util.Scanner;

public class PermutationWithRecursion2 {

	public static void main(String args[]){
		int permutation = inputNumPermutation();
		
        System.out.println("The permutations are: ");
        
        int[] array=new int[permutation];
        fillArray(array);
        
        permute(array, permutation, 0);
    }
	
	public static void fillArray(int[] num){
		
		for(int i =0; i<num.length;i++){
			num[i]=i+1;
		}
		
	}
	
	public static int inputNumPermutation(){
		Scanner inputs = new Scanner(System.in);
		int permutNum=0;
		
		while(true){
			System.out.print("Enter the number of permutation: ");
			permutNum = inputs.nextInt();
			
			if(permutNum>0){
				break;
			}
	
			System.out.println("The number has to be greater than zero!");
		}
		
		inputs.close();
		return permutNum;

	}
	
	public static void permute(int[] array, int permutation, int i) {
		if (i == permutation) { 
			print(array);

		} else {
			for (int k = i; k < permutation; k++) {
				swap(array, i, k);
				permute(array, permutation, i + 1);
				swap(array, i, k);
 
			}
		}
	}
	
	 public static void swap(int[] array, int i, int j) {
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		}
	
	
	public static void print(int[] permutation){
		System.out.print("(");
		for(int i=0; i<permutation.length;i++){
			System.out.print(permutation[i]);
			if(i<permutation.length-1){
				System.out.print(",");
			}
		}
		System.out.print(")");
	}

}