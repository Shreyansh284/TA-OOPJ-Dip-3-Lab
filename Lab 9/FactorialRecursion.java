import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
