package Lab_23.Q3;

import Lab_23.Q3.Calculater.MathOperation;

public class DemoOperation {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println("Add: " + mo.add(10, 5));
        System.out.println("Sub: " + mo.sub(10, 5));
        System.out.println("Mul: " + mo.mul(10, 5));
        System.out.println("Div: " + mo.div(10, 5));
    }
}
