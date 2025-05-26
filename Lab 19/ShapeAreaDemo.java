class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();

        Triangle triangle = new Triangle(4, 6);
        triangle.area();

        Square square = new Square(3);
        square.area();
    }
}
