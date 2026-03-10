// Ex1-a Registration class with basic fields and print
public class RegistrationDemo {
    public static void main(String[] args) {
        Registration reg = new Registration(
                "Sreeraj Patnaik",
                'M',
                20,
                5.9,
                9876543210L,
                false
        );
        System.out.println(reg);
    }
}

class Registration {
    private String fullName;
    private char gender;
    private int age;
    private double height;
    private long phoneNumber;
    private boolean isMarried;

    Registration(String fullName, char gender, int age, double height, long phoneNumber, boolean isMarried) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.phoneNumber = phoneNumber;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Full Name: " + fullName + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n" +
                "Height: " + height + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Is Married: " + isMarried;
    }
}
