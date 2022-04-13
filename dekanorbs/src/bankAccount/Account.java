package bankAccount;

public class Account {

    private static String pin;
    private static String lastName;
    private static String firstName;
    private static int accountBalance;

    public Account(String firstName, String lastName, String pin) {
        Account.firstName = firstName;
        Account.lastName = lastName;
        Account.pin = pin;
    }

    public static String getName() {
        return firstName + " "+ lastName;
    }

    public int getBalance( String pin) {
        if (pin.equals(Account.pin)){return accountBalance;}
        return 0;
    }

    public void deposit(int amount) {
        if(amount > 0)accountBalance += amount;
    }

    public void withdraw(int amount, String pin) {
        if(Account.pin.equals(pin))
        accountBalance -= amount;
    }
}