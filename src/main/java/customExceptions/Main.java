package customExceptions;

public class Main {
    BankingAccount b = new BankingAccount(5000.00);
    public double getCurrentBalance()
    {
        return b.getBalance();
    }
    public boolean withDrawlStatus(double amount){

        try{
            BankingAccount.withDraw(amount);
            return true;
        } catch (InvalidWithdrawalException | InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}
