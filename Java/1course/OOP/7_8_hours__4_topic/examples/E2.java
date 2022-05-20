class Shape {
    void draw() {
        System.out.println("drawing a shape...");
    }
}


class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing a rectangle...");
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("drawing a circle...");
    }
}


class Triangle extends Shape {
    void draw() {
        System.out.println("drawing a triangle...");
    }
}

public class E2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        rectangle.draw();
        circle.draw();
        triangle.draw();
    }
}
