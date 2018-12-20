public class BankAccountClient {
    public static void main(String[] args) {
        BankAccountV2 jacksonsAccount = new BankAccountV2("Jackson", 5634897, new AddressV1(123, "Nofrickinidea", "Middleofabsolutelynowhere","New York", 1337), new DateOfBirthV1(12, 28,2001)) ;
        System.out.println(jacksonsAccount);
        jacksonsAccount.deposit(1000);
        System.out.println(jacksonsAccount.getAddress());
        System.out.println(jacksonsAccount.getDateOfBirth());
    }
}
