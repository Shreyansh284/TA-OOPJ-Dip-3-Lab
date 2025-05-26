// Single Inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("Sports car turbo mode ON.");
    }
}

// Hierarchical Inheritance
class Person {
    void walk() {
        System.out.println("Person is walking.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        // Multilevel Inheritance
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
        sportsCar.turbo();

        System.out.println();

        // Hierarchical Inheritance
        Teacher teacher = new Teacher();
        teacher.walk();
        teacher.teach();

        Student student = new Student();
        student.walk();
        student.study();
    }
}
