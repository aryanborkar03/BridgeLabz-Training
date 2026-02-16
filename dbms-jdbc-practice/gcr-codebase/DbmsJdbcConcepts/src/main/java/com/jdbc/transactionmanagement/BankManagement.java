package com.jdbc.transactionmanagement;

import java.sql.*;
import java.util.Scanner;

public class BankManagement {

    static final String url = "jdbc:mysql://localhost:3306/sqlpractice";
    static final String username = "root";
    static final String password = "Aryan@120";   

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. View All Accounts");
            System.out.println("2. Transfer Money");
            System.out.println("3. View Transactions");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: viewAccounts(); break;
                case 2: transferMoney(); break;
                case 3: viewTransactions(); break;
                case 4: System.exit(0);
            }
        }
    }


    // VIEW ACCOUNTS
   
    static void viewAccounts() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            String query = "SELECT * FROM accounts";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("accountID") + " | " +
                        rs.getString("accountHOLDER") + " | Balance: " +
                        rs.getDouble("balance"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
    // MONEY TRANSFER (TRANSACTION)
    
    static void transferMoney() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.print("Enter Sender Account ID: ");
            int from = sc.nextInt();

            System.out.print("Enter Receiver Account ID: ");
            int to = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            con.setAutoCommit(false);

            // Check sender balance
            PreparedStatement checkBalance =
                    con.prepareStatement(
                            "SELECT balance FROM accounts WHERE accountID=?");

            checkBalance.setInt(1, from);
            ResultSet rs = checkBalance.executeQuery();

            if (!rs.next() || rs.getDouble("balance") < amount) {

                System.out.println("Insufficient Balance / Invalid Sender");
                con.rollback();
                return;
            }

            // Debit sender
            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance - ? WHERE accountID=?");

            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            // Credit receiver
            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance + ? WHERE accountID=?");

            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            // Insert transaction record
            PreparedStatement insertTxn =
                    con.prepareStatement(
                            "INSERT INTO transactions(from_account, to_account, amount) VALUES (?, ?, ?)");

            insertTxn.setInt(1, from);
            insertTxn.setInt(2, to);
            insertTxn.setDouble(3, amount);
            insertTxn.executeUpdate();

            con.commit();

            System.out.println("Money Transferred Successfully");

        } catch (Exception e) {
            System.out.println("Transaction Failed");
            System.out.println(e);
        }
    }

    
    // VIEW TRANSACTIONS

    static void viewTransactions() {

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            String query = "SELECT * FROM transactions";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        "TxnID: " + rs.getInt("transaction_id") +
                        " | From: " + rs.getInt("from_account") +
                        " | To: " + rs.getInt("to_account") +
                        " | Amount: ₹" + rs.getDouble("amount") +
                        " | Date: " + rs.getTimestamp("transaction_date"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
