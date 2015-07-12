import java.util.Scanner;

public class SurfaceOfRectangle {

	public static void main(String[] args) {
			double lengthRec, widthRec, surfaceRec;
			Scanner inputs = new Scanner(System.in, "UTF-8");
			
			System.out.print("Enter length of the rectangle: ");
			lengthRec=inputs.nextDouble();
			
			System.out.print("Enter width of the rectangle: ");
			widthRec=inputs.nextDouble();
			
			surfaceRec=lengthRec*widthRec;
			
			System.out.println("The surface of the rectangle is: " + surfaceRec);
			
			inputs.close();

	}

}
