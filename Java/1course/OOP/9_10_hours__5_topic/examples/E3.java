abstract class Shape {
    String color;
    public abstract double getPerimeter();
    public abstract double getSquare();
    public abstract String getColor();
}

class Circle extends Shape {
    private String color;
    final double pi = 3.14;
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * this.radius;
    }
    @Override
    public double getSquare() {
        return pi * this.radius * this.radius;
    }
    @Override
    public String getColor() {
        return this.color;
    }
}

class Rectangle extends Shape {
    private String color;

    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    @Override
    public double getSquare() {
        return this.width * this.height; 
    }
    public String getColor() {
        return this.color;
    }
}

public class E3 {
    
}
