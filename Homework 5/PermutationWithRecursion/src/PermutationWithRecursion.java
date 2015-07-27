import java.util.Scanner;

public class PermutationWithRecursion {

	public static void main(String args[]){
		int permutation = inputNumPermutation();
		
        String str = numToString(permutation);
        permutation = sumOfElemPermutation(permutation);
        
        System.out.println("The permutations are: ");
        
        int quoma=0;
        permute("", str, quoma, permutation);
    }
	
	public static int sumOfElemPermutation(int num){
		int permutationSum=0;
		
		for(int i =1; i<=num;i++){
			permutationSum+=i;
		}
		
		return permutationSum;
	}
	
	
	public static String numToString(int num){
		String str="";
		
		for(int i =1; i<=num;i++){
			str+=i;
		}
		
		return str;
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
	
	public static void permute(String begStr, String endStr, int quoma, int permutation) {

	    if (endStr.length() <= 1){
	    	print("(" + begStr + endStr + ")");
	    	if(quoma<permutation-1){
				print(",");
			}
	    }else{
	      for (int i = 0; i < endStr.length(); i++) {
	    	  quoma++; 
	          String newStr = endStr.substring(0, i) + endStr.substring(i + 1);
	          permute(begStr + endStr.charAt(i) + ",", newStr, quoma, permutation);
	      }
	    }
	}
	

	public static void print(String permutation){
		System.out.print(permutation);
	}

}
