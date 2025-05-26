import java.util.Scanner;

class Circle {
    double radius;

    void getRadius() {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println(a);
    }

    void perimeter() {
        double p = 2 * Math.PI * radius;
        System.out.println(p);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getRadius();
        c.area();
        c.perimeter();
    }
}
