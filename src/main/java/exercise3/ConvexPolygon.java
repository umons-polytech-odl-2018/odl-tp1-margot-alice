package exercise3;

public class ConvexPolygon {

	private Point vertices [];

	public ConvexPolygon(Point ver []){
		this.vertices=ver;

}
	private double areatriangle(Point A, Point B, Point C){
		return (Math.abs((A.getX()-C.getX())*(B.getY()-C.getY())-(A.getY()-C.getY())*(B.getX()-C.getX()))/2);

	}
	public double area() {
		double area = 0;
		Point centre = new Point(0, 0);
		for (Point i : vertices) {
			centre.setX(centre.getX() + i.getX());
			centre.setY(centre.getY() + i.getY());
		}
		centre.setX(centre.getX() / vertices.length);
		centre.setY(centre.getY() / vertices.length);
		for (int i = 0; i < vertices.length; i++) {
			if (i + 1 != vertices.length) area += areatriangle(vertices[i], vertices[i + 1], centre);
			else area += areatriangle(vertices[i], vertices[0], centre);
		}
		return area;
	}
public double perimeter(){
		return 0.0;
		// to do !
}
}

