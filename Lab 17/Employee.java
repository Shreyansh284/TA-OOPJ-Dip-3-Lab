//  Constructor Overloading (C)
public class Employee {
    String name;
    int age;

    Employee() {
        name = "None";
        age = 0;
    }

    Employee(String n) {
        name = n;
        age = 0;
    }

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob", 30);
        e1.display();
        e2.display();
        e3.display();
    }
}
