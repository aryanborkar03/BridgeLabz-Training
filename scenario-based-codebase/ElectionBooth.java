//Creating a class election booth manager so as to find who is eligible to vote or not
import java.util.Scanner;
public class ElectionBooth {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


//running inside a while loop to run until user says exit
        while(true){
            int age = sc.nextInt();

            //special code to exit the loop 
            if(age == 0)
                break;

            if(age < 18){
                System.out.println("Not Eligible");
                continue;
            }

            int vote = sc.nextInt(); 
            if(vote == 1 || vote == 2 || vote == 3)
                System.out.println("Vote Recorded");
            else
                System.out.println("Invalid Vote");
        }
    }
}
