interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
