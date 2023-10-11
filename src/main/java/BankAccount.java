import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;

    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    private String accountType;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, float balance, String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;

        accountType = "regular";
        this.accountType = accountType;

        balance = 0;
        this.balance = balance;
    }
// Getterz
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public LocalDate getDateOfBirth() {return this.dateOfBirth;}
    public int getAccountNumber() {return this.accountNumber;}
    public double getAccountBalance() {return this.balance;}

    // Setterz
    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }
public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
}
public void setLastName(String newLastName){
        this.lastName = newLastName;
}
public void setDateOfBirth(LocalDate newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
}
public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
}
public void setAccountBalance(double newAccountBalance){
        this.balance = newAccountBalance;
}
public void deposit(float newDeposit){
        this.balance = balance + newDeposit;
}

public void withdraw(float newWidthrawal){
        this.balance = balance - newWidthrawal;
}

public void payInterest(){
        double interest = 0;

        if (accountType=="saver"){
            interest = 0.09;
        }
        else if (accountType=="regular"){
        interest = 0.05;
        }

        this.balance = (this.balance + (this.balance*interest));

}




}
