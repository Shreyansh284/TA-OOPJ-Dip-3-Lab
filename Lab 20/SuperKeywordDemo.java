class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    int num = 200;

    Child() {
        super(); // calling parent constructor
        System.out.println("Child constructor called");
    }

    void display() {
        super.display(); // calling parent method
        System.out.println("Child display method");
    }

    void printNum() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num); // accessing parent variable
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.printNum();
    }
}
