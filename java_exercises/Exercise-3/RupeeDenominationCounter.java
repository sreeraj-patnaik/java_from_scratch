// Ex3-c Rupee denomination breakdown and total notes
import java.util.Scanner;

public class RupeeDenominationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int amount = scanner.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int totalNotes = 0;

        for (int note : notes) {
            int count = amount / note;
            if (count > 0) {
                System.out.println(note + " x " + count);
                totalNotes += count;
                amount %= note;
            }
        }

        System.out.println("Total notes: " + totalNotes);
    }
}
