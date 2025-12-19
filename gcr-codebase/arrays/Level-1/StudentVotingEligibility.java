//Created class to check voting eligibility of students
import java.util.Scanner;
public class StudentVotingEligibility {
    public static void main(String[] args) {

        //taking input of ages for 10 students
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        //checking voting eligibility based on age
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } 
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            } 
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }
    }
}
