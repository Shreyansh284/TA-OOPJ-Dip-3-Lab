import java.util.Scanner;

class Bank_Account {
    int Account_No;
    String User_Name;
    String Email;
    String Account_Type;
    double Account_Balance;

    void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);
        Account_No = sc.nextInt();
        sc.nextLine();
        User_Name = sc.nextLine();
        Email = sc.nextLine();
        Account_Type = sc.nextLine();
        Account_Balance = sc.nextDouble();
    }

    void DisplayAccountDetails() {
        System.out.println(Account_No);
        System.out.println(User_Name);
        System.out.println(Email);
        System.out.println(Account_Type);
        System.out.println(Account_Balance);
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account();
        b.GetAccountDetails();
        b.DisplayAccountDetails();
    }
}
