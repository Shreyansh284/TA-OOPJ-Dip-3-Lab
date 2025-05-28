package Lab_23.Q3.Calculater;

public class MathOperation {
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b) { return b != 0 ? a / b : 0; }
}
