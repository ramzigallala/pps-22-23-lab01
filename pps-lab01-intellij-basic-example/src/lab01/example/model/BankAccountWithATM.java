package lab01.example.model;

public interface BankAccountWithATM extends BankAccount{
    void depositWithAtm(int userID, int amount);

    void withdrawWithAtm(int userID, int amount);
}
