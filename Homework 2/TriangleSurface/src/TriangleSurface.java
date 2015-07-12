import java.util.Scanner;

public class TriangleSurface {

	public static void main(String[] args) {
		int sideTri, heightTri;
		double surfaceTri;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("Enter length of the side: ");
		sideTri=inputs.nextInt();
		
		System.out.print("Enter length of the height: ");
		heightTri=inputs.nextInt();
		
		surfaceTri=sideTri*heightTri*0.5;
		
		System.out.println("The surface of the triangle is: " + surfaceTri);
		
		inputs.close();

	}

}
