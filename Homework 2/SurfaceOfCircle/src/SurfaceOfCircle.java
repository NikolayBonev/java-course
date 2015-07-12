import java.util.Scanner;
import java.lang.Math;

public class SurfaceOfCircle {

	public static void main(String[] args) {
		double surfaceCir, perimeterCir;
		int radius;
		// double radius;
		Scanner inputs = new Scanner(System.in, "UTF-8");

		System.out.print("Enter the radius: ");
		radius=inputs.nextInt();
		//radius=inputs.nextDouble();
		
		perimeterCir=2*radius*Math.PI;
		surfaceCir=radius*radius*Math.PI;
		
		System.out.println("The perimeter is "+ perimeterCir + " and the surface is " + surfaceCir);
		
		inputs.close();
		
	}

}
