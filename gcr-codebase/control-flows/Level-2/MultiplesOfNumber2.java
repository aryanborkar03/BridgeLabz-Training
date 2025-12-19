//Created class Named MultiplesOfNumber2 using while loop
import java.util.Scanner;
public class MultiplesOfNumber2{
   public static void main(String[]args){

    //take input from the user and check whether it is positive and less than 100
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();

    if(number<=0 || number>=100){
        System.out.println("Please enter a positive number less than 100");
    }
    else{
        int counter=number-1;

        //use while loop to find multiples below 100
        while(counter>1){
            if(number%counter==0){
                System.out.println(counter);
            }
            counter--;
        }
    }
   }
}
