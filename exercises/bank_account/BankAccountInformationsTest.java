package exercises.bank_account;

public class BankAccountInformationsTest {
    public static void main(String[] args) {
        BankAccountInformations serhatAccount = new BankAccountInformations();

        serhatAccount.setCustomerName("serhat");
        serhatAccount.setAccountNumber("12");
        serhatAccount.setEmail("user@goodmai.com");
        serhatAccount.setPhoneNumber("02355412578");

        System.out.println("Name : " + serhatAccount.getCustomerName());
        System.out.println("AccountNumber : " + serhatAccount.getAccountNumber());
        System.out.println("Email : " + serhatAccount.getEmail());
        System.out.println("PhoneNumber : " + serhatAccount.getPhoneNumber());
        System.out.println("AccountBalance : " + serhatAccount.getAccountBalance());

        serhatAccount.withdrawingFund(45);
        serhatAccount.depositeFund(10000);
        serhatAccount.getAccountBalance();
        serhatAccount.withdrawingFund(120);
    }
}
