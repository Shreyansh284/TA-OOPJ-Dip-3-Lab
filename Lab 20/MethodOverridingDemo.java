class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's overridden show method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Parent p2 = new Child();
        p2.show();  // runtime polymorphism
    }
}
