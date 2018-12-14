public class BankAccount {
    private double balance;
    private String name;
    private int accountID;
    private int SSN;
    private int pin;
    private String address;
    private int dateOfBirth;


    //Two overloaded constructors; first is for online account creation, second is for in person
    public BankAccount(String name, int SSN, String address, int dateOfBirth) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public BankAccount(String name, int SSN, String address, int dateOfBirth, double balance, int pin) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
        this.pin = pin;
    }

    //Getters below

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    //Mutators below

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Balance: " + balance;
    }
}
