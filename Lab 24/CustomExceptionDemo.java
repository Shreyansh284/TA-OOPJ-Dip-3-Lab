class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception.");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
