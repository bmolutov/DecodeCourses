public class BoundedTypeDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2.0, 2.0);
		Circle circle = new Circle(2.0);

		System.out.println("Same area? " + equalArea(rectangle, circle));
	}

	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		if(object1.getArea() == object2.getArea()) {
			return true;
		} else {
			return false;
		}
	}
}


abstract class GeometricObject {
	public double area;
	public double perimeter;

	public double getArea() {
		return this.area;
	}
	public double getPerimeter() {
		return this.perimeter;
	}
}


class Rectangle extends GeometricObject {
	public double height;
	public double width;
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;

		this.area = height * width;
		this.perimeter = 2 * (height + width);
	}
}


class Circle extends GeometricObject {
	public final double PI = 3.14;
	public double radius;
	public Circle(double radius) {
		this.radius = radius;

		this.area = PI * Math.pow(radius, 2);
		this.perimeter = 2 * PI * radius;
	}
}
