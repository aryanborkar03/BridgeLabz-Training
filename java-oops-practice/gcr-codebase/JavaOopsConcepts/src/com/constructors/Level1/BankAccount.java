package com.constructors.Level1;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance; // private for safety

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // public methods to access and update balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}
