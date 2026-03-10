// Ex4-b Student class using constructor and toString
public class StudentConstructorToStringDemo {
    public static void main(String[] args) {
        StudentData student = new StudentData(101, "Aarav", 'M', "CSE", 20, 8.7);
        System.out.println(student);
    }
}

class StudentData {
    private int studentId;
    private String studentName;
    private char gender;
    private String department;
    private int age;
    private double aggregate;

    StudentData(int studentId, String studentName, char gender, String department, int age, double aggregate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.department = department;
        this.age = age;
        this.aggregate = aggregate;
    }

    @Override
    public String toString() {
        return "Student Id: " + studentId + "\n" +
                "Student Name: " + studentName + "\n" +
                "Gender: " + gender + "\n" +
                "Department: " + department + "\n" +
                "Age: " + age + "\n" +
                "Aggregate: " + aggregate;
    }
}
