import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println(sumFor);

        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println(sumWhile);
    }
}
