import java.util.Scanner;

public class OddThreeSevenWhile {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		int inputNum=0;
		
		while(true){
			System.out.print("Enter a number: ");
			if(inputs.hasNextInt()){
				inputNum=inputs.nextInt();
				if(inputNum<2){
					System.out.println("The number was to be greater than 1 !");
				}else{
					break;
				}
			}else{
				System.out.println("Invalid value!");
				inputs.next();
			}
		}
		
		int num=1;
		while(num<=inputNum){
			if(num%3!=0){
				if( num%7!=0 || num%7==0){
					System.out.print(num + " ");
				}
			}else{
				if( num%7!=0){
					System.out.print(num + " ");
				}
			}
			
//			In the comment lines is a more compact			
//			if((num%3!=0 && (num%7!=0 || num%7==0)) || (num%3==0 && num%7!=0)){
//				System.out.print(num + " ");
//			}
			
			num++;
		}
		
		inputs.close();
	}

}
