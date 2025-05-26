public class StaticBlockExample {
    static {
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        show();
    }
}
