//Created class Named ArmstrongNumber to find the armstrong number using while loop 
import java.util.Scanner;
public class ArmstrongNumber{
   public static void main(String[]args){

    //take input from the user
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();

    int sum=0;
    int originalNumber=number;

    //use while loop to calculate sum of cubes of digits
    while(originalNumber!=0){
        int digit=originalNumber%10;
        sum=sum+(digit*digit*digit);
        originalNumber=originalNumber/10;
    }

    //check whether the number is an Armstrong number
    if(sum==number){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("Not an Armstrong Number");
    }
   }
}
