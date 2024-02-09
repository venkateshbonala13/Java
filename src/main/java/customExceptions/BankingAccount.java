package customExceptions;

public class BankingAccount {
    private static double balance;

    public BankingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    static void withDraw(double amount) throws InvalidWithdrawalException, InsufficientFundsException {
        if (amount < 0) {

            // throw an object of user defined exception
            throw new InvalidWithdrawalException("Attempting to withdraw a negative amount.");
        } else if (amount > balance ) {

            throw new InsufficientFundsException("Attempting to withdraw more money than the account balance.");
        } else {
            balance=balance- amount;
            System.out.println("Successful withdrawal.");
        }
    }
}
