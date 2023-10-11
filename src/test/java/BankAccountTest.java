import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

   public BankAccount testAccount = new BankAccount("Tom", "Mclaughlin", LocalDate.of(1999,11,11), 1604, 0, "saver", -50);

//   @Test
//    void bankAccountTest(){
//      BankAccount testAccount = new BankAccount("Tom", "Mclaughlin", LocalDate.of(1999,11,11), 1604, 0);
//   }

   @Test
   void bankAccountTestFirstName(){
      String expectedFirstName = testAccount.getFirstName();
      assertThat(expectedFirstName).isEqualTo("Tom");
      //test setter
      testAccount.setFirstName("Cookie");
      assertThat(testAccount.getFirstName()).isEqualTo("Cookie");
   }

   @Test
   void bankAccountTestLastName(){
      String expectedLastName = testAccount.getLastName();
      assertThat(expectedLastName).isEqualTo("Mclaughlin");
      //test setter
      testAccount.setLastName("Monster");
      assertThat(testAccount.getLastName()).isEqualTo("Monster");
   }

   @Test
   void bankAccountDateTest(){
      LocalDate expectedBirthDate = testAccount.getDateOfBirth();
      assertThat(expectedBirthDate).isEqualTo(LocalDate.of(1999,11,11));
      //test setter
      testAccount.setDateOfBirth(LocalDate.of(2000, 01, 01));
      assertThat(testAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2000,01,01));
   }

   @Test
   void bankAccountNumberTest(){
      //test account number getter
      int expectedAccountNumber = testAccount.getAccountNumber();
      assertThat(expectedAccountNumber).isEqualTo(1604);
      //test account number setter
      testAccount.setAccountNumber(000);
      assertThat(testAccount.getAccountNumber()).isEqualTo(000);

   }

   @Test
   void bankAccountBalanceTest(){
      double expectedBalance = testAccount.getAccountBalance();
      assertThat(expectedBalance).isEqualTo(0);
      //test setter
      testAccount.setAccountBalance(5000);
      assertThat(testAccount.getAccountBalance()).isEqualTo(5000);
   }

   @Test
   void bankAccountTestDeposit(){
      //deposit test amount
      testAccount.deposit(540);
      assertThat(testAccount.getAccountBalance()).isEqualTo(540);

   }

   @Test
   void bankAccountTestWithdraw(){
      //deposit test amount
      testAccount.deposit(540);
      //withdraw test amount
      testAccount.withdraw(25);
      assertThat(testAccount.getAccountBalance()).isEqualTo((540-25));

   }

   @Test
   void bankAccountTestInterest(){
      //deposit test amount
      testAccount.deposit(540);
      testAccount.payInterest();
      assertThat(testAccount.getAccountBalance()).isEqualTo((540+27));

   }

   @Test
   void bankAccountTestAccountInterest(){
      // test regular account.
      testAccount.deposit(540);
      testAccount.setAccountType("regular");
      testAccount.payInterest();
      assertThat(testAccount.getAccountBalance()).isEqualTo((540+27));

      // test saver account
      testAccount.setAccountBalance(540);
      testAccount.setAccountType("saver");
      testAccount.payInterest();
      assertThat(testAccount.getAccountBalance()).isEqualTo((540+48.6));
   }
@Test
   void bankAccountTestOverdraft(){
      testAccount.setAccountBalance(0);
      testAccount.setOverdraft(-60);
      testAccount.withdraw(60);
      assertThat(testAccount.getAccountBalance()).isEqualTo(0);

}



}
