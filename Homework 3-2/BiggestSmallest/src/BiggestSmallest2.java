import java.util.Scanner;

public class BiggestSmallest2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.println("Between the numbers you have to have spaces and some symbol at the end!");
		System.out.print("Enter a number: ");
		int smallestNum=0, biggestNum=0, swapNum=0, i=0;
		
		while(true){
			
			if(inputs.hasNextInt()){
				
				swapNum=inputs.nextInt();
				System.out.print("Enter a number: ");
				
				if(i==1){
					biggestNum=swapNum;
					i++;
				}else if(i==0){
					smallestNum=swapNum;
					
				}	
				
				if(smallestNum>biggestNum && i==2){
					swapNum=smallestNum;
					smallestNum=biggestNum;
					biggestNum=swapNum;
				}
				
				if(swapNum<smallestNum && i>2){
					smallestNum=swapNum;
				}else if(swapNum>biggestNum && i>2){
					biggestNum=swapNum;
				}
				
				i++;
				
			}else{
				break;
			}
		}
		
		System.out.println("The biggest is " + biggestNum + " and the smallest is " + smallestNum);
		
		inputs.close();


	}

}