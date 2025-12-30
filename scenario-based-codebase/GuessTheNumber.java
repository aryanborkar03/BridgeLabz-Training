import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //used Math.random and converted to int type to genrate a random number every time 
        int random = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guess;

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess > random) {
                System.out.println("Too High");
            } 
            else if (guess < random) {
                System.out.println("Too Low");
            } 
            else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }

        } while (attempts < 5);

        if (guess != random) {
            System.out.println("You used all 5 attempts, you FAILED!!");
        }
    }
}
