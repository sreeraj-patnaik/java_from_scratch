// Ex2-c Even indexed even values and odd indexed odd values
import java.util.Scanner;

public class IndexedParityArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] values = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println("Even indexed even numbers:");
        for (int i = 0; i < n; i += 2) {
            if (values[i] % 2 == 0) {
                System.out.print(values[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Odd indexed odd numbers:");
        for (int i = 1; i < n; i += 2) {
            if (values[i] % 2 != 0) {
                System.out.print(values[i] + " ");
            }
        }
    }
}
