import java.util.Scanner;

public class NpowerM2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		int i=0 , poweredNum=0 , powerNum=0;
		
		while(i<2){
			if(i==0){
				System.out.print("Enter a number: ");
			}else{
				System.out.print("Enter the with which we will power: ");
			}
			
			if(inputs.hasNextInt()){
				if(i==0){
					poweredNum=inputs.nextInt();
				}else{
					powerNum=inputs.nextInt();
				}
				
				i++;
			}else{
				System.out.println("Invalid value!");
				inputs.next();
			}
		}
		
		i=0;
		int poweredResultNum=1;

		while(i<powerNum){
			poweredResultNum *= poweredNum;
			i++;
		}
		
		System.out.println("Result: " + poweredResultNum);
		
		inputs.close();

	}

}
