import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxAB = Math.max(a, b);
        int maxABC = Math.max(maxAB, c);

        System.out.println(maxABC);
    }
}
