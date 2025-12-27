package com.constructors.Level1;

public class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor
    public BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ main moved here
    public static void main(String[] args) {
        SavingsAccount s1 =
                new SavingsAccount(12345, "Rahul", 5000);

        System.out.println(s1.getBalance());
        s1.showDetails();
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void showDetails() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }
}
