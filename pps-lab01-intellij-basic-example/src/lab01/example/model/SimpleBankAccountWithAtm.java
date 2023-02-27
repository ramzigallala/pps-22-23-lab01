package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

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

    }
}
