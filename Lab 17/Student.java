// Default and Parameterized Constructor (A)
public class Student {
    String name;
    int age;

    Student() {
        name = "Default";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John", 22);
        s1.display();
        s2.display();
    }
}
