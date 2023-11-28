abstract class Figure {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: length = " + length + ", width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class Trapezium extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezium(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public String toString() {
        return "Trapezium: base1 = " + base1 + ", base2 = " + base2 + ", height = " + height +
                ", side1 = " + side1 + ", side2 = " + side2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Trapezium trapezium = (Trapezium) obj;
        return Double.compare(trapezium.base1, base1) == 0 &&
                Double.compare(trapezium.base2, base2) == 0 &&
                Double.compare(trapezium.height, height) == 0 &&
                Double.compare(trapezium.side1, side1) == 0 &&
                Double.compare(trapezium.side2, side2) == 0;
    }
}

public class task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(5, 7),
                new Circle(3),
                new Trapezium(4, 8, 6, 5, 5)
        };

        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println();
        }
    }
}
