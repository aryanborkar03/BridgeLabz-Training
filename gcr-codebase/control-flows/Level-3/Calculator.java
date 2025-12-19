//Created class Named Calculator using switch
import java.util.Scanner;
public class Calculator{
   public static void main(String[]args){

    //take input values from the user
    Scanner sc=new Scanner(System.in);
    double first=sc.nextDouble();
    double second=sc.nextDouble();
    String op=sc.next();

    //use switch case for calculation
    switch(op){
        case "+":
            System.out.println(first+second);
            break;

        case "-":
            System.out.println(first-second);
            break;

        case "*":
            System.out.println(first*second);
            break;

        case "/":
            System.out.println(first/second);
            break;

        default:
            System.out.println("Invalid Operator");
    }
   }
}
