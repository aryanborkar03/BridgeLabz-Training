package com.budgetwise;

import java.util.Scanner;

public class BudgetWise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================== BUDGETWISE APP =================");

        // Monthly budget input
        System.out.print("Enter monthly budget amount: ");
        double monthlyAmount = sc.nextDouble();
        sc.nextLine();

        MonthlyBudget budget = new MonthlyBudget(monthlyAmount);

        // Category limits
        System.out.print("How many categories do you want to set? ");
        int categoryCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < categoryCount; i++) {
            System.out.print("\nEnter category name: ");
            String category = sc.nextLine();

            System.out.print("Enter limit for " + category + ": ");
            double limit = sc.nextDouble();
            sc.nextLine();

            budget.setCategoryLimit(category, limit);
        }

        // Transactions
        System.out.print("\nHow many monthly transactions? ");
        int txnCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < txnCount; i++) {
            System.out.println("\nTransaction " + (i + 1));

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Type (income/expense): ");
            String type = sc.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Category/Note: ");
            String note = sc.nextLine();

            budget.addTransaction(amount, type, date, note);
        }

        // Reports
        budget.generateReport();
        budget.detectOverspend();

        // Annual budget
        System.out.print("\nEnter annual budget amount: ");
        double annualAmount = sc.nextDouble();
        sc.nextLine();

        AnnualBudget annual = new AnnualBudget(annualAmount);

        System.out.print("How many annual transactions? ");
        int annualTxn = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < annualTxn; i++) {
            System.out.println("\nAnnual Transaction " + (i + 1));

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Type (income/expense): ");
            String type = sc.nextLine();

            System.out.print("Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Category/Note: ");
            String note = sc.nextLine();

            annual.addTransaction(amount, type, date, note);
        }

        annual.generateReport();
        annual.detectOverspend();

        System.out.println("\n================== Thanks for using =================");

        sc.close();
    }
}
