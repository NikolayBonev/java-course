import java.util.Scanner;

public class ABNumbers {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter number A: ");
		int numA=inputs.nextInt();
		System.out.print("Enter number B: ");
		int numB=inputs.nextInt();
		
		boolean flagOpen=true;
		if(numA>numB){
			System.out.println("B has to be greater than A");
			flagOpen=false;
		}
		
		for(int i=numA;i<=numB && flagOpen==true;i++){
			if(i%3==0){
				System.out.print(i + " ");
			}
		}
		
		inputs.close();

	}

}
