// Ex4-a Student class with insert and display methods
import java.util.Scanner;

public class StudentMethodDemo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        student.insertStudent();
        student.displayStudent();
    }
}

class StudentRecord {
    private int studentId;
    private String studentName;
    private char gender;
    private String department;
    private int age;
    private double aggregate;

    void insertStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Id: ");
        studentId = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Gender: ");
        gender = scanner.nextLine().trim().charAt(0);
        System.out.print("Department: ");
        department = scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Aggregate: ");
        aggregate = Double.parseDouble(scanner.nextLine().trim());
    }

    void displayStudent() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Aggregate: " + aggregate);
    }
}
