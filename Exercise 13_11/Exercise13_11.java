import java.util.Scanner;

public class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupported­Exception {
		Scanner input = new Scanner(System.in);
		
		Octagon octagon1 = new Octagon(100);
		
		System.out.println("\nOctagon 1:" + "\nArea: " + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());
		
		System.out.println("\nOctagon 2 aka Clone is . . .");
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		int result = (octagon1.compareTo(octagon2));
		if(result == 1)
			System.out.println("Lesser than Octagon 1.");
		else if(result == -1)
			System.out.println("Greater than Octagon 1.");
		else
			System.out.println("Equal to Octagon 1");
	}
}