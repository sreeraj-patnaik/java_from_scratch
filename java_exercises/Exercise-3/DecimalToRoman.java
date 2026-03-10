// Ex3-a Decimal to Roman conversion
import java.util.Scanner;

public class DecimalToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int number = scanner.nextInt();

        if (number <= 0 || number > 3999) {
            System.out.println("Enter a value between 1 and 3999");
            return;
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (number > 0) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
            i++;
        }

        System.out.println("Roman: " + roman);
    }
}
