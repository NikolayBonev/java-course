//Направете програма, която приема две числа с плаваща запетая съответно дължината и ширината 
//на правоъгълник. Пресметнете лицето на дадения правоъгълник и я изведете на конзолата

import java.util.Scanner;

public class SurfaceOfRectangle {

	public static void main(String[] args) {
			double lengthRec, widthRec, surfaceRec;
			Scanner inputs = new Scanner(System.in, "UTF-8");
			
			System.out.print("Въведете дължината на правоъгълника: ");
			//System.out.print("Enter length of the rectangle: ");
			lengthRec=inputs.nextDouble();
			
			System.out.print("Въведете ширината на правоъгълника: ");
			//System.out.print("Enter width of the rectangle: ");
			widthRec=inputs.nextDouble();
			
			surfaceRec=lengthRec*widthRec;
			
			System.out.println("Лицето на триъгълника е: " + surfaceRec);
			
			inputs.close();

	}

}
