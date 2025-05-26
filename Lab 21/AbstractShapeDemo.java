abstract class Shape {
    abstract double area();  // abstract method
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
