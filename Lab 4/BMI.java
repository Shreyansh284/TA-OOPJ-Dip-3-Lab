import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = sc.nextDouble();
        double inches = sc.nextDouble();
        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;
        double bmi = weightKg / (heightM * heightM);
        System.out.println(bmi);
        sc.close();
    }
}
