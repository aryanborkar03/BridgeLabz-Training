import java.util.Scanner;
public class  QuotientAndReminder{
    public static void main(String args[])
	{
	
	 //to find quotient and reminder of two numbers
	 Scanner sc = new Scanner(System.in);
	 int number1;
	 number1 = sc.nextInt();
     int number2;
     number2 = sc.nextInt(); 
     int quotient = number1 / number2;
	 int reminder = number1 % number2;
	 
	 
	 
	 //to print the quotient and reminder of two numbers
	 System.out.println("The Quotient is " + quotient +" and Reminder is " + reminder + " of two number " + number1 +" and " + number2);

	  
	}
}
