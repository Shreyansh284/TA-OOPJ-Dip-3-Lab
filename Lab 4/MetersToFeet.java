import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(feet);
        sc.close();
    }
}
