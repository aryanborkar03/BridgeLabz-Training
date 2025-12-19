//Created class Named PowerOfNumber2
import java.util.Scanner;
public class PowerOfNumberWhileLoop{
   public static void main(String[]args){

    //take input from the user
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int power=sc.nextInt();

    if(number<=0 || power<=0){
        System.out.println("Please enter positive integers");
    }
    else{
        int result=1;
        int counter=0;

        //use while loop to calculate power of the number
        while(counter<power){
            result=result*number;
            counter++;
        }

        //print the result
        System.out.println(result);
    }
   }
}
