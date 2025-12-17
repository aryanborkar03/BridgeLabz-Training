import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


       //to get all values of add,sub,div and multiplication of number1 and number 2 we will do following calculation

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;

        int division = number1 / number2;     



        //to print the values of addition, subtraction, multiplication and division value of 2 numbers
        System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is "
            + addition + ", " + subtraction + ", " + multiplication + " and " + division
        );
    }
}
