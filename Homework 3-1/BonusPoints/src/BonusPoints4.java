import java.util.Scanner;

public class BonusPoints4 {

	public static void main(String[] args) {
Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter your points: ");
		int pointsPlayer = inputs.nextInt();
		if(pointsPlayer>=1 && pointsPlayer<=9){
			switch (pointsPlayer) {
				case 7:
				case 8:
				case 9:
					pointsPlayer = pointsPlayer*5;
				case 4:
				case 5:
				case 6:
					pointsPlayer = pointsPlayer*2;
				case 1:
				case 2:
				case 3:
					pointsPlayer = pointsPlayer*5;
					break;
			}
			System.out.println("Points of player are: " + pointsPlayer);
		}else{
			System.out.println("Invalid points!");
		}
		
		//System.out.println("Points of player are: " + pointsPlayer); 
		//We can use the print Method in the if statement or out side it.

	}

}
