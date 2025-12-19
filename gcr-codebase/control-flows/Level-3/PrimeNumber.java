//Created class Named PrimeNumber to give as output the prime number
import java.util.Scanner;
public class PrimeNumber{
   public static void main(String[]args){

    //take number as input from the user and check whether it is greater than 1
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number<=1){
        System.out.println("Not a Prime Number");
    }
    else{
        boolean isPrime=true;

        //use loop to check whether the number is prime or not
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }

        //print the appropriate result
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
   }
}
