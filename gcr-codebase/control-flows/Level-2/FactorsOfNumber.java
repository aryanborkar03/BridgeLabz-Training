//Created class  FactorsOfNumber to find factors o given imput
import java.util.Scanner;
public class FactorsOfNumber{
   public static void main(String[]args){

//take input from the user and check whether it is a positive integer
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();

    if(number<=0){
        System.out.println("Please enter a positive integer");
    }
    else{

//use for loop to find factors of the given numbers
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
   }
}
