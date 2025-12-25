import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gst = 0.05;

        while (true) {
            System.out.println("Enter coffee type or exit:");
            String type = sc.nextLine().toLowerCase();

            if (type.equals("exit")) {
                break;
            }

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            int price;

            switch (type) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            double total = (price * qty);
			double bill = total + (total*gst);

            System.out.println("Total bill: " + bill);
            System.out.println();
        }

       
    }
}
