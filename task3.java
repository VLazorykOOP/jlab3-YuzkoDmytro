interface Figure2 {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle2 implements Figure2 {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle2: length = " + length + ", width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle2 rectangle = (Rectangle2) obj;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }
}

class Circle2 implements Figure2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle2: radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Circle2 circle = (Circle2) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class Trapezium2 implements Figure2 {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezium2(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public String toString() {
        return "Trapezium2: base1 = " + base1 + ", base2 = " + base2 + ", height = " + height +
                ", side1 = " + side1 + ", side2 = " + side2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Trapezium2 trapezium = (Trapezium2) obj;
        return Double.compare(trapezium.base1, base1) == 0 &&
                Double.compare(trapezium.base2, base2) == 0 &&
                Double.compare(trapezium.height, height) == 0 &&
                Double.compare(trapezium.side1, side1) == 0 &&
                Double.compare(trapezium.side2, side2) == 0;
    }
}

public class task3 {
    public static void main(String[] args) {
        Figure2[] figures = {
                new Rectangle2(5, 7),
                new Circle2(3),
                new Trapezium2(4, 8, 6, 5, 5)
        };

        for (Figure2 figure : figures) {
            System.out.println(figure);
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println();
        }
    }
}
