package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		// TODO build a ConvexPolygon
		//return ConvexPolygon.buildConvexPolygon();
		ConvexPolygon convexPolygon = new ConvexPolygon(vertices);
		System.out.println("perimetre polygone = "+ convexPolygon.perimeter() + " aire = " + convexPolygon.area());
		return null;
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		// TODO build a Rectangle
		Rectangle rectangle = new Rectangle(upperLeft, lowerRight);
		return null;
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		// TODO build a square
		Square square = new Square(upperLeft, sideLength);
		return null;
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		// TODO build an ellipsis
		Ellipsis ellipsis = new Ellipsis(center, xAxisLength, yAxisLength);
		return null;
	}

	static Ellipsis buildCircle(Point center, int radius) {
		// TODO build a circle
		Circle circle = new Circle(center, radius);
		return null;
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its perimeter
		return convexPolygon.perimeter();
		//return 0.0;
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its area
		return convexPolygon.area();
		//return 0.0;
	}

	static double computePerimeter(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its perimeter
		return ellipsis.perimeter();
		//return 0.0;
	}

	static double computeArea(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its area
		return ellipsis.area();
		//return 0.0;
	}
}
