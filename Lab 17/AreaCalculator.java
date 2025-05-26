//  Area of Circle, Triangle, and Square using Method Overloading (A)
public class AreaCalculator {
    void area(double r) {
        System.out.println(3.14 * r * r);
    }

    void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }

    void area(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(5.0);
        obj.area(4, 6);
        obj.area(4);
    }
}
