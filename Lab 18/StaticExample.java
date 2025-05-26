public class StaticExample {
    static int count = 0;

    StaticExample() {
        count++;
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticExample a = new StaticExample();
        StaticExample b = new StaticExample();
        StaticExample c = new StaticExample();
        c.display();
    }
}
