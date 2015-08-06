import java.util.Scanner;

public class StringsContainingWord {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter the string in wich will be searched the sentences for the word: ");
		String strIn = inputs.nextLine();
		
		System.out.print("Enter the word wich will be seached: ");
		String capStr = inputs.nextLine();
		
		findSentenceWithWord(strIn, capStr);

		inputs.close();

	}

	public static void findSentenceWithWord(String inStr, String subStr){
		
		StringBuilder sb = new StringBuilder(inStr.length());
		
		String[] arr = inStr.split("\\.");
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].indexOf(subStr)!=-1 || arr[i].equalsIgnoreCase(subStr)){
				sb.append(arr[i]);
				sb.append(".");
			}
		}
		
		System.out.print("New sentence:\n" + sb.toString());		
	}
	
}
