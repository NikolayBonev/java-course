import java.util.Scanner;

public class BiggestOfFive2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		int inputNum, biggestNum=0;
		
		int i=0;
		while(i<5){
			
			System.out.print("Enter a number: ");
			
			if(inputs.hasNextInt()){
				inputNum = inputs.nextInt();
				if(inputNum>biggestNum){
					biggestNum=inputNum;
				}
				i++;
			}else{
				System.out.println("Invalid value!");
				inputs.next();
			}
		}
		
		System.out.print("Biggest number is: " + biggestNum);

	}

}
