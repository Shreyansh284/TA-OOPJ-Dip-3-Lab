public class ThisStaticCheck {
    static int x = 100;

    void display() {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisStaticCheck obj = new ThisStaticCheck();
        obj.display();
    }
}
