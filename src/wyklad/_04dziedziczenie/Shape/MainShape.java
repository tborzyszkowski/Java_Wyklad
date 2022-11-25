package wyklad._04dziedziczenie.Shape;

public class MainShape {
	public static void main(String[] args) {
		IShape shape;
		Circle circle = new Circle();
		Square square = new Square();

		shape = circle;
		shape.draw();

		shape = square;
		shape.draw();

	}
}
