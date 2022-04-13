package bankAccountTest;

import bankAccount.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    static Bank gtBank;
    @BeforeEach
    public void set(){
        gtBank = new Bank("Ikeja",10);
    }
    @Test
    public void bankCanBeCreatedTest(){
        assertNotNull(gtBank);
    }
    @Test
    public void bankHasAccountsTest(){
        assertEquals(10,gtBank.getMaxNumberOfAccount());
    }
    @Test
    public void bankBranchTest(){
        assertEquals("Ikeja",gtBank.getBankBranch());
    }
    @Test
    public void createBankAccountTest(){
        gtBank.register("Oluwasegun","Adeayo","1123");
        assertEquals(1,gtBank.getNumberOfRegisteredAccounts());
    }
    @Test
    public void getBankAccountNameTest(){
        gtBank.register("Oluwasegun","Adeayo","1123");
        assertEquals(1,gtBank.getNumberOfRegisteredAccounts());
        assertEquals("Oluwasegun Adeayo", gtBank.findAccount(1).getName());
    }

    @Test
    public  void depositTest(){
        gtBank.register("Oluwasegun","Adeayo","1123");
        gtBank.deposit(10_000,1);
        assertEquals(10000,gtBank.balance(1,"1123"));

        gtBank.register("Segun","Adeayo","1223");
        gtBank.deposit(2000,2);
        assertEquals(2000,gtBank.balance(2,"1223"));
    }
}
