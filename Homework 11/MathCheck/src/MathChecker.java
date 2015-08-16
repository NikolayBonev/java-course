import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MathChecker {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter mathematic eqesion: ");
		String mathText = inputs.nextLine();
		
		Queue<String> numbers = isNumber(mathText);
		Stack<Character> plusMinus = isPlusMinus(mathText);
		
		try{
			sumOfNums(numbers, plusMinus);
		}catch (IllegalArgumentException e){
			System.out.println("Error:" + e);
		}finally {
			if(plusMinus.isEmpty()){
				System.out.println(mathText + " = " + numbers.poll());
			}else{
				System.out.println(mathText + " = " + plusMinus.pop() + numbers.poll());
			}
				
			System.out.println("Done!");
		}
		
		inputs.close();
		
	}
		
	public static void sumOfNums(Queue<String> numbers, Stack<Character> plusMinus) throws IllegalArgumentException{
			
		while(!plusMinus.isEmpty() && numbers.size() > 1){
			int num1 = Integer.parseInt(numbers.poll());
			int num2 = Integer.parseInt(numbers.poll());
			
			if(numbers.size() == plusMinus.size()){
				if(plusMinus.pop() == '-'){
					num1*=-1;
				}
				if(plusMinus.pop() == '-'){
					num2*=-1;
				}
				
				int numRes = num1 + num2;
//				System.out.println(numRes);
				reorganizeStack(plusMinus, numRes);
				numRes = Math.abs(numRes);
				numbers.offer("" + numRes);
				
			}else{
				int numRes;
				if(plusMinus.pop() == '+'){
					numRes = num1 + num2;
//					System.out.println(numRes);
					reorganizeStack(plusMinus, numRes);
				}else {
					numRes = num1 - num2;
//					System.out.println(numRes);
					reorganizeStack(plusMinus, numRes);
					numRes = Math.abs(numRes);
					
				}
				numbers.offer("" + numRes);	
			}
		}
	}
	
/*		This function after every addition or subtraction reorganizes the stack and
 * 		puts in the bottom of the stack the sing of the new number that is added to
 * 		the queue.
 */
	public static void reorganizeStack(Stack<Character> sym, int plusMin){
		Stack<Character> buffer = new Stack<Character>();
		
		while(!sym.isEmpty()){
			buffer.push(sym.pop());
		}
		
		if(plusMin >= 0){
			sym.push('+');
		}else{
			sym.push('-');
		}
		
		while(!buffer.isEmpty()){
			sym.push(buffer.pop());
		}
	}
	
/*		This function checks is there on every odd index of the string has a plus or minus and
 * 		puts it in the stack.
 * 		If in the even index there is something else (number or oder) the function throws
 * 		IllegalArgumentException.
 */
	public static Stack<Character> isPlusMinus(String mathText) throws IllegalArgumentException{
		Stack<Character> plusMinus = new Stack<Character>();
		
		for(int j = mathText.length()-2 ; j >= 0; j-=2){
			if(mathText.charAt(j) == '+' || mathText.charAt(j) == '-'){
//				System.out.println(mathText.charAt(j));
				plusMinus.push(mathText.charAt(j));
			}else{
				throw new IllegalArgumentException("Invalid input");
			}
		}
		
		return plusMinus;
	}
	
/*		This function checks is there on every even index of the string has a number and
 * 		puts the number in the queue.
 * 		If in the even index there is something else ("+", "-" or oder) the function throws
 * 		IllegalArgumentException.
 */
	public static Queue<String> isNumber(String mathText) throws IllegalArgumentException{
		Queue<String> numbers = new LinkedList<String>();
		
		for(int i = 0 ; i < mathText.length() ; i+=2){
			if(Character.isDigit(mathText.charAt(i))){
				numbers.offer("" + mathText.charAt(i));
			}else{
				throw new IllegalArgumentException("Invalid input");
			}
		}
		
		return numbers;
	}

}
