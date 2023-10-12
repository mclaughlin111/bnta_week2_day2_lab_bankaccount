import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private double overdraft;
    private String accountType;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType, double overdraft) {
        //don't need to pass a value for bank balance at first point here.
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;

        accountType = "regular";
        this.accountType = accountType;

        balance = 0;
//        this.balance = balance;

        overdraft = 0;
        this.overdraft = overdraft;
    }

    // Getterz

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getAccountBalance() {
        return this.balance;
    }
    // Setterz
    public void setAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setAccountBalance(double newAccountBalance) {
        this.balance = newAccountBalance;
    }

    public void deposit(double newDeposit) {
        this.balance += newDeposit;
    }

    public void withdraw(double newWidthrawal) {
        boolean overdraftMet = false;
        if (this.balance < overdraft) {
            overdraftMet = true;
            System.out.println("overdraft met or account overdrawn");
        }
        while (overdraftMet = false) {
            this.balance = this.balance - newWidthrawal;
        }
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
// Extension methods

    public void payInterest() {
        double interest = 0;

        if (accountType == "saver") {
            interest = 0.09;
        } else if (accountType == "regular") {
            interest = 0.05;
        }

        this.balance = (this.balance + (this.balance * interest));

    }


}
