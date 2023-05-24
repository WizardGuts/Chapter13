import java.util.Scanner;

public class Exercise13_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GeometricObject[] triangles = {new Triangle(10), new Triangle(5), new Triangle(16.5), new Triangle(20), new Triangle(18)};
		
		for (int i = 0; i < triangles.length; i++) {
			if (triangles[i] instanceof Colorable) {
			System.out.println("\n Triangle Number " + (i + 1));
			System.out.println("\n How to color method.");
			((Colorable)triangles[i]).howToColor();
			System.out.println("\n Area: " + triangles[i].getArea());
			System.out.println("\n Perimeter: " + triangles[i].getPerimeter());
			}
		}
	}
}