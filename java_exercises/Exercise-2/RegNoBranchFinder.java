// Ex2-a Branch from register number using else-if and switch
import java.util.Scanner;

public class RegNoBranchFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Regd.No: ");
        String regNo = scanner.nextLine().trim();

        if (regNo.length() < 8) {
            System.out.println("Invalid Regd.No");
            return;
        }

        char code = regNo.charAt(7);

        String branchByIf;
        if (code == '5') {
            branchByIf = "CSE";
        } else if (code == '4') {
            branchByIf = "ECE";
        } else if (code == '3') {
            branchByIf = "MECH";
        } else if (code == '2') {
            branchByIf = "EEE";
        } else {
            branchByIf = "Unknown";
        }

        String branchBySwitch;
        switch (code) {
            case '5':
                branchBySwitch = "CSE";
                break;
            case '4':
                branchBySwitch = "ECE";
                break;
            case '3':
                branchBySwitch = "MECH";
                break;
            case '2':
                branchBySwitch = "EEE";
                break;
            default:
                branchBySwitch = "Unknown";
        }

        System.out.println("Else-if result: " + branchByIf);
        System.out.println("Switch result: " + branchBySwitch);
    }
}
