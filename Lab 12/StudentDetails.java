import java.util.Scanner;

class Student {
    String name;
    int roll;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.showDetails();
    }
}
