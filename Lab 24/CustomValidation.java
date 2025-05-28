public class CustomValidation {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);

                if (num < 0) throw new Exception("Negative number");
                if (num % 10 == 0) throw new Exception("Divisible by 10");
                if (num > 1000 && num < 2000) throw new Exception("Between 1000 and 2000");
                if (num > 7000) throw new Exception("Greater than 7000");

                sum += num;
            } catch (Exception e) {
                System.out.println("Skipped: " + arg + " (" + e.getMessage() + ")");
            }
        }

        System.out.println("Sum = " + sum);
    }
}
