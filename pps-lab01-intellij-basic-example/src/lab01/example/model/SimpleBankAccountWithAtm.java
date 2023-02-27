package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccountWithATM {

    public static final int FEE = 1;
    private final AccountHolder holder;
    private double balance;
    public SimpleBankAccountWithAtm(AccountHolder holder, int i) {
        this.holder = holder;
        this.balance = i;
    }

    @Override
    public AccountHolder getHolder() {
        return null;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        if(holder.getId() == userID){
            this.balance = balance+amount;
        }

    }

    @Override
    public void withdraw(int userID, double amount) {
        if(holder.getId()==userID && isWithdrawAllowed(amount)){
            this.balance = balance-amount;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    @Override
    public void depositWithAtm(int userID, int amount) {
        deposit(this.holder.getId(),amount-FEE);
    }

    @Override
    public void withdrawWithAtm(int userID, int amount) {
        if(holder.getId()==userID && isWithdrawAllowed(amount)){
            this.balance = balance-(amount+FEE);
        }
    }
}
