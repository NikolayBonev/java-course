/*
 * 7 11 14 21 22 28 33 35 42 44 49 55 56 63 66 70 77 84 88 91 98 99 
 */

public class EvenSevenElevenWhile {

	public static void main(String[] args) {
		
		int num=1;
		while(num<=100){
			if(num%7==0 || num%11==0){
				System.out.print(num + " ");
			}
			num++;
		}

	}

}
