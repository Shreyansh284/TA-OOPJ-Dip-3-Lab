import java.util.Scanner;

class AccountDetails {
    String name;
    double principal;
    double rate;
    int time;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        name = sc.nextLine();
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        time = sc.nextInt();
    }
}

class Interest extends AccountDetails {
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + name);
        System.out.println("Total Interest: " + interest);
    }
}

public class InterestDemo {
    public static void main(String[] args) {
        Interest interest = new Interest();
        interest.getDetails();
        interest.displayInterest();
    }
}
