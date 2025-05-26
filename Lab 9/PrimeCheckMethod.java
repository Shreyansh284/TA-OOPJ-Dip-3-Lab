import java.util.Scanner;

public class PrimeCheckMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = check(n);
        if (result == 1) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    static int check(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }
}
