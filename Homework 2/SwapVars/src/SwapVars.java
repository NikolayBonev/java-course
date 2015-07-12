public class SwapVars {

	public static void main(String[] args) {
		int swap=0, num1=5, num2=8;
		
		System.out.println("Number first=" + num1 + " .Number secound=" + num2);
		swap=num1;
		num1=num2;
		num2=swap;

		System.out.println("Number first=" + num1 + " .Number secound=" + num2 + " after swap.");
	}

}
