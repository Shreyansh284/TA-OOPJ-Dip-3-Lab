import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = i;
        double pi = sc.nextDouble();
        int x = (int) pi;
        System.out.println(d);
        System.out.println(x);
    }
}
