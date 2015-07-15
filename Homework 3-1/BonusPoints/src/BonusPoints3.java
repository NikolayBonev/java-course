import java.util.Scanner;

public class BonusPoints3 {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter your points: ");
		int pointsPlayer = inputs.nextInt();
		int ifState = pointsPlayer;
		if(pointsPlayer>=1 && pointsPlayer<=9){
			switch (pointsPlayer) {
				case 7:
				case 8:
				case 9:
				case 1:
				case 2:
				case 3:
					pointsPlayer = pointsPlayer*5;
					if(ifState>=1 && ifState<=3){
						break;
					}
				case 4:
				case 5:
				case 6:
					pointsPlayer = pointsPlayer*10;
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
