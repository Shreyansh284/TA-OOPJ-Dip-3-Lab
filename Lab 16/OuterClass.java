public class OuterClass {
    int x = 5;

    static class NestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        obj.display();
    }
}
