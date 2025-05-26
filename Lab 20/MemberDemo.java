class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    void printManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class MemberDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 28;
        emp.phoneNumber = "1234567890";
        emp.address = "123 Main St";
        emp.salary = 50000;
        emp.specialization = "Software Development";

        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 35;
        mgr.phoneNumber = "0987654321";
        mgr.address = "456 Park Ave";
        mgr.salary = 80000;
        mgr.department = "IT";

        emp.printEmployeeDetails();
        mgr.printManagerDetails();
    }
}
