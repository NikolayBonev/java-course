public class SwapVars2 {
	
	public static void main(String[] args) {
		int num1=5, num2=8;
		
		System.out.println("Number first=" + num1 + " .Number secound=" + num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Number first=" + num1 + " .Number secound=" + num2 + " after swap.");

	}
}
