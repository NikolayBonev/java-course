import java.util.Scanner;

public class CheckBegginingFinish {

	public static void main(String[] args) {
		
		String line = inputLine();
		
		CheckString(line);

	}
	
	public static void CheckString(String str){
		
		boolean startSubStr = str.startsWith("Greeting");
		boolean endSubStr = str.endsWith(".");
		
		int findWord = str.indexOf("water");
		
		System.out.println("The sentense starts with \"Greeting\": " + startSubStr);
		System.out.println("The sentense ends with a dot: " + endSubStr );
		if(findWord<0){
			System.out.println("The sentense don't contain the word water!");
		}else{
			System.out.println("The sentense contains the word water on index: " + findWord);
		}
		
	}
	
	public static String inputLine(){
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.println("Enter a sentense: ");
		String line = inputs.nextLine();
		
		inputs.close();
		
		return line;
	}

}
