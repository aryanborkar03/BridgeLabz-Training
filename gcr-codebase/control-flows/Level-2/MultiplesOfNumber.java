//Created class Named MultiplesOfNumber to find the multiples
import java.util.Scanner;
public class MultiplesOfNumber{
   public static void main(String[]args){

    //take input from the user and check whether it is positive and less than 100
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();

    if(number<=0 || number>=100){
        System.out.println("Enter  a positive number less than 100");
    }
    else{

        //use for loop  to find multiples below 100
        for(int i=100;i>=1;i--){
            if(i%number==0){
                System.out.println(i);
            }
        }
    }
   }
}
