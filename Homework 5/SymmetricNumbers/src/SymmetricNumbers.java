
public class SymmetricNumbers {

	public static void main(String[] args) {
		
		for(int i=10;i<1000;i++){
			symmetricCheck(i);
			
		}

	}
	
	public static void symmetricCheck(int number){
		if(number/100 != 0 && number/100 == number%10){
			print(number);
		}else if(number/100 == 0 && number/10 == number%10){
			print(number);
		}
	}
	
	public static void print(int symNum){
		System.out.print(" " + symNum);
	}

}
