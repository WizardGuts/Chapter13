public class Triangle extends GeometricObject implements Colorable{

	private double side;
		
	Triangle() {
	}
	
	Triangle(double side) {
		this.side = side;
	}
	
	Triangle(double side, String color,boolean filled) {
		super(color, filled);
		setSide(side);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double getSide) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		double s = (side * 3) / 2;
		return Math.sqrt(s * (s - side) * (s - side) * (s - side));
	}
	
	@Override
	public double getPerimeter() {
		return side * 3;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all three sides: ");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter:" + getPerimeter();
	}
}