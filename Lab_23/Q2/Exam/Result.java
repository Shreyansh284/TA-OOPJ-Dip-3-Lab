package Lab_23.Q2.Exam;

import Lab_23.Q2.Student.Student;

public class Result extends Student {
    int marks1, marks2;

    public Result(String name, int roll, int marks1, int marks2) {
        super(name, roll);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + (marks1 + marks2));
    }
}
