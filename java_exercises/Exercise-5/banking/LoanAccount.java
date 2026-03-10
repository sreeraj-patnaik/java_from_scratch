// Ex5-b Loan account child class
package banking;

public class LoanAccount extends Account {
    private double loanAmount;

    public LoanAccount(String holderName, long accountNumber, double balance, double loanAmount) {
        super(holderName, accountNumber, balance);
        this.loanAmount = loanAmount;
    }

    public void showType() {
        System.out.println("Loan Account with Loan Amount: " + loanAmount);
    }
}
