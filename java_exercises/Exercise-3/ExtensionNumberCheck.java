// Ex3-b Check extension number
import java.util.Scanner;

public class ExtensionNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = scanner.nextLong();

        long square = n * n;
        long temp = n;
        long divisor = 1;

        if (temp == 0) {
            divisor = 10;
        } else {
            while (temp > 0) {
                divisor *= 10;
                temp /= 10;
            }
        }

        if (square % divisor == n) {
            System.out.println(n + " is an Extension number");
        } else {
            System.out.println(n + " is not an Extension number");
        }
    }
}
