import java.util.Scanner;

public class InvertedString {

	public static void main(String[] args) {
		String name;
		
		name=inputString();
		
		name=reverseString(name);
		
		System.out.print("Inverted string: ");
		printString(name);
	}
	
	public static String inputString(){
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter string: ");
		String inputString=inputs.nextLine();
		
		inputs.close();
		
		return inputString;
	}
	
	public static String reverseString(String originString){
		String invertedString="";
		for(int i=originString.length()-1;i>=0;i--){
			invertedString+=originString.charAt(i);
		}
		
		return invertedString;
	}
	
	public static void printString(String value){
		System.out.print(value);
		System.out.println();
	}

}
