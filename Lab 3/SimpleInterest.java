public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double roi = 5;
        double time = 2;
        double interest = (principal * roi * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
