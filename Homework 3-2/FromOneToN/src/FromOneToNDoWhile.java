import java.util.Scanner;

public class FromOneToNDoWhile {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		int Nnum=0;
		
		while(true){
			System.out.print("Enter a number: ");
			if(inputs.hasNextInt()){
				Nnum=inputs.nextInt();
				if(Nnum<2){
					System.out.println("The number was to be greater than 1 !");
				}else{
					break;
				}
			}else{
				System.out.println("Invalid value!");
				inputs.next();
			}
		}
		
		int i=1;
		
		do{
			System.out.print(i + " ");
			i++;
		}while(i<=Nnum);
		
		inputs.close();

	}

}
