import java.util.Scanner;

public class MaxOfThreeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = findMax(a, b, c);
        System.out.println(max);
    }

    static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        else return c;
    }
}
