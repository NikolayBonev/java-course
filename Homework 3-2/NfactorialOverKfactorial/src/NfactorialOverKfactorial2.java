import java.util.Scanner;

public class NfactorialOverKfactorial2 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		int numN=0, numK=0 , insertNum=0 , i=0;
		double numFactorial=1;
		boolean infinityStop=false;
		
			while(true){
				if(i==0){
					System.out.print("Insert N number: ");
				}else if(i==1){
					System.out.print("Insert K number: ");
				}
				if(inputs.hasNextInt()){
					insertNum=inputs.nextInt();
					if(i==0){
						numN=insertNum;
					}else if(i==1){
						numK=insertNum;
					}
					
					
					if(numK<0 && i>1){
						System.out.println("K has to be greather than minus one less than N!");
						i--;
					}else if(numN==0 && numK!=0 && i==1){
						numN=1;
						break;
					}else if(numK>numN && i==1){
						System.out.println("N has to be greater than K!");
						i-=2;
					}else if(numN==0 && numK==0 && i==1){
						infinityStop=true;
						break;
					}else if(i==1){
						break;
					}
					
					i++;
					
				}
			}
			
			for(i=1;i<=numK && numN==1 && infinityStop==false;i++){
				numFactorial/=i;
			}
			
			for(numK++;numK<=numN && infinityStop==false;numK++){
				numFactorial*=numK;
			}

		
		
		System.out.println("N!/K! = " + numFactorial);
		
		inputs.close();


	}

}
