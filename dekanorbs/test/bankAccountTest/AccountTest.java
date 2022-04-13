package bankAccountTest;

import bankAccount.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    public Account account;
    @BeforeEach
    public void set(){
        account = new Account("Oluwasegun", "Adeayo", "1123");
    }

    @Test
    public void accountHasBeenCreatedTest(){

        assertNotNull(account);
    }
    @Test
    public void accountNameTest(){
        assertEquals("Oluwasegun Adeayo",account.getName());
    }
    @Test

    public void balanceTest(){
        assertEquals(0,account.getBalance("1123"));
    }
    @Test
    public void balanceRequiresPinTest(){

        account.deposit(2000);
        assertEquals(0,account.getBalance("123"));
    }
    @Test
    public void depositTest(){

        account.deposit(2000);
        assertEquals(2000,account.getBalance("1123"));
    }
    @Test
    public void nonNegativeDepositTest(){
        account.deposit(2000);
        account.deposit(-2000);
        assertEquals(2000,account.getBalance("1123"));
    }
    @Test
    public void withdrawWithWrongPinTest(){
        account.deposit(2000);
        account.withdraw(1000,"1234");
        assertEquals(2000,account.getBalance("1123"));
    }
    @Test
    public void withdrawTest(){
        account.deposit(2000);
        account.withdraw(1000,"1123");
        assertEquals(1000,account.getBalance("1123"));
    }
}
