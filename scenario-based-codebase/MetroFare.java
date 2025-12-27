//creating a class MetroFare to calculate the fare between 2 points
import java.util.Scanner;
public class MetroFare {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int balance = 200;

        while(balance > 0){
            int distance = sc.nextInt();

            //enter 0 to quit
            if(distance == 0)
                break;

            int fare = distance <= 5 ? 10 : distance <= 10 ? 20 : 30;

            if(balance >= fare){
                balance -= fare;
                System.out.println("Balance: " + balance);
            }
            else{
                System.out.println("Insufficient Balance");
                break;
            }
        }
    }
}

