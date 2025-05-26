import java.util.Scanner;

class Student {
    int Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;

    void GetStudentDetails() {
        Scanner sc = new Scanner(System.in);
        Enrollment_No = sc.nextInt();
        sc.nextLine();
        Student_Name = sc.nextLine();
        Semester = sc.nextInt();
        CPI = sc.nextDouble();
        SPI = sc.nextDouble();
    }

    void DisplayStudentDetails() {
        System.out.println(Enrollment_No);
        System.out.println(Student_Name);
        System.out.println(Semester);
        System.out.println(CPI);
        System.out.println(SPI);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.GetStudentDetails();
        s.DisplayStudentDetails();
    }
}
