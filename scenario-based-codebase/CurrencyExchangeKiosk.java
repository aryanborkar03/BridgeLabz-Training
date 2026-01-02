/* 18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter amount in INR:");
            double inr = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter target currency (USD / EUR / GBP):");
            String currency = sc.nextLine();

            switch (currency) {

                case "USD":
                    System.out.println("Amount in USD: " + (inr * 0.012));
                    break;

                case "EUR":
                    System.out.println("Amount in EUR: " + (inr * 0.011));
                    break;

                case "GBP":
                    System.out.println("Amount in GBP: " + (inr * 0.0095));
                    break;

                default:
                    System.out.println("Invalid currency");
            }

            System.out.println("Do you want another conversion? (yes/no)");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));
    }
}
