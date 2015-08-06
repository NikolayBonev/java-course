import java.util.Scanner;

public class CountOfWordInText {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		System.out.print("Enter sentence in wich will be searched a word: ");
		String strIn = inputs.nextLine();
		
		System.out.print("Enter the word wich will be searched: ");
		String searWord = inputs.nextLine();
		
		int count = timesWordFound(strIn, searWord);
		
		System.out.printf("The word \"%s\" is found %d times!", searWord, count);

		inputs.close();
	}
	
	public static int timesWordFound(String strIn, String subStr){
		int count = 0, index = 0;
		
		index = strIn.indexOf(subStr);
		while(index!=-1){
			if(index>-1){
				count++;
			}
			index = strIn.indexOf(subStr, index+1);
			
		}
		
		return count;
	}

}
