public class BankAccountV2 {
    private double balance;
    private String name;
    private int accountID;
    private int SSN;
    private int pin;
    private AddressV1 address;
    private DateOfBirthV1 dateOfBirth;


    //Two overloaded constructors; first is for online account creation, second is for in person
    public BankAccountV2(String name, int SSN, AddressV1 address, DateOfBirthV1 dateOfBirth) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public BankAccountV2(String name, int SSN, AddressV1 address, DateOfBirthV1 dateOfBirth, double balance, int pin) {
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

    public DateOfBirthV1 getDateOfBirth() {
        return dateOfBirth;
    }

    public AddressV1 getAddress() {
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
