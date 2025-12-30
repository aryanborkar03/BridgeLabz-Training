import java.util.Scanner;

public class MobileRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalBalance = 0;
        int again;

        do{
            String network = sc.next();
            double amt = sc.nextDouble();

            //show offer based on network
            switch(network){
                case "Jio":
                    System.out.println("1.5GB/day");
                    break;
                case "Airtel":
                    System.out.println("2GB/day");
                    break;
                case "Vi":
                    System.out.println("Weekend rollover");
                    break;
                default:
                    System.out.println("Invalid");
                    continue;
            }

            totalBalance += amt;
            System.out.println(totalBalance);

            again = sc.nextInt();

        }while(again == 1);
    }
}
