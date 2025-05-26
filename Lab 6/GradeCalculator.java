import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }
        double percentage = total / 5.0;
        if (percentage < 35) {
            System.out.println("Fail");
        } else if (percentage < 45) {
            System.out.println("Pass Class");
        } else if (percentage < 60) {
            System.out.println("Second Class");
        } else if (percentage < 70) {
            System.out.println("First Class");
        } else {
            System.out.println("Distinction");
        }
    }
}
