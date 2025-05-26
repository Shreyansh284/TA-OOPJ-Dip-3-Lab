import java.util.Scanner;

class Employee {
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    void GetEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        Employee_ID = sc.nextInt();
        sc.nextLine();
        Employee_Name = sc.nextLine();
        Designation = sc.nextLine();
        Age = sc.nextInt();
        Salary = sc.nextDouble();
    }

    void DisplayEmployeeDetails() {
        System.out.println(Employee_ID);
        System.out.println(Employee_Name);
        System.out.println(Designation);
        System.out.println(Age);
        System.out.println(Salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.GetEmployeeDetails();
        e.DisplayEmployeeDetails();
    }
}
