package bankAccount;

public class Bank {
    private Account[] accounts;
    private String branch;
    private int accountIndex = 0;

    public Bank(String branch, int numberOfAccount) {
        accounts = new Account[numberOfAccount];
        this.branch = branch;
    }
    public String getBankBranch() {
        return branch;
    }
    public int getMaxNumberOfAccount() {
        return accounts.length;
    }

    public void register(String firstName, String lastName, String pin) {
        accounts[accountIndex] = new Account(firstName, lastName, pin);
        accountIndex++;
    }


    public int getNumberOfRegisteredAccounts() {
        return accountIndex;
    }

    public  Account findAccount(int accountNumber) {
        return accounts[accountNumber-1];
    }

    public void deposit(int amount, int accountNumber) {
        findAccount(accountNumber).deposit(amount);
    }

    public int balance(int accountNumber, String pin) {
        return findAccount(accountNumber).getBalance(pin);
    }
}
