package exercises.bank_account;

public class BankAccountInformations {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositeFund(double amount){
        accountBalance+=amount;
        System.out.println("you deposit " + amount + " your current balance is : " + accountBalance);
    }

    public void withdrawingFund(double amount){

        if (accountBalance == 0) {
            System.out.println("no funds you can not withdraw money");
        }else {
            accountBalance-=amount;
            System.out.println("you withdraw " + amount + " your current balance is : " + accountBalance);
        }
    }




}
