// Ex1-b Type casting and conversion demo
public class TypeCastingConversionDemo {
    public static void main(String[] args) {
        int number = 100;
        double widened = number;

        double price = 456.78;
        int narrowed = (int) price;

        String marksText = "95";
        int marks = Integer.parseInt(marksText);

        int total = 250;
        String totalText = String.valueOf(total);

        System.out.println("Widening int to double: " + widened);
        System.out.println("Narrowing double to int: " + narrowed);
        System.out.println("String to int: " + marks);
        System.out.println("int to String: " + totalText);
    }
}
