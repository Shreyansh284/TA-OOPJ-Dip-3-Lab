import java.util.Scanner;

public class BreakOnDivisibleBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 7 == 0) break;
            System.out.println(n);
        }
    }
}
