package com.constructors.Level1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder); // protected access
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount s1 =
                new SavingsAccount(1234875, "Aryan", 50000);

        s1.showDetails();
        s1.setBalance(6500);
        System.out.println("Updated Balance: " + s1.getBalance());
    }
}
