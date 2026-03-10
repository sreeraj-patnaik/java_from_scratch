// Ex2-b First and second largest using command line arguments
public class FirstSecondLargestCLA {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Provide at least two integers");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (String arg : args) {
            int value = Integer.parseInt(arg);

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest not found (all values may be same)");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
