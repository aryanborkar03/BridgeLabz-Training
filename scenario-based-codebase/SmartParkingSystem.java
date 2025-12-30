import java.util.Scanner;

public class SmartParkingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Smart Parking System");
        System.out.println("Enter Parking Lot size");

        int capacity = sc.nextInt();
        int parkinglot = capacity;
        sc.nextLine();

        while (true) {

            String s = sc.nextLine();

            switch (s) {

                case "park":
                    if (parkinglot > 0) {
                        System.out.println("Car is Parked");
                        parkinglot--;
                    } else {
                        System.out.println("Parking Full");
                    }
                    break;

                case "exit":
                    if (parkinglot < capacity) {
                        System.out.println("Car Exited");
                        parkinglot++;
                    } else {
                        System.out.println("Parking Empty");
                    }
                    break;

                case "show occupancy":
                    System.out.println("Available Slots: " + parkinglot);
                    System.out.println("Occupied Slots: " + (capacity-parkinglot));
                    break;

                case "quit":
                    System.out.println("System Stopped");
                    
                    return;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
