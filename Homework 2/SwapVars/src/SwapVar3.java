public class SwapVar3 {
	
	public static void main(String[] args) {
		int num1=5, num2=8;
		
		System.out.println("Number first=" + num1 + " .Number secound=" + num2);

/*      This code can be used if the numbers are entered randomly

		if(num1==0){
			num1=num2;
			num2=0;
		}
		else if(num2==0){
			num2=num1;
			num1=0;
		}
		else{
			num1=num1*num2;
			num2=num1/num2;
			num1=num1/num2;
		}

*/
		
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		
		System.out.println("Number first=" + num1 + " .Number secound=" + num2 + " after swap.");

	}
}
