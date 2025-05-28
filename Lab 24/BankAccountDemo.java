class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }
        balance -= amount;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        try {
            acc.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
