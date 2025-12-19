//to create a class ToCheckNumberPositiveNegative to segrigate numbers based on positive,negative and zero.
import java.util.Scanner;
public class ToCheckNumberPositiveNegative {
    public static void main(String args[]){


    //taking input variables number that need to be evaluated
    Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	
	//Using if-else statements to determine if the number is Zero,Positive or negative
	if(number == 0)
	{
	 System.out.println("Zero");
	}
	
	else if(number > 0 )
	{
	 System.out.println("Positive");
	}
	
	else 
	{
	 System.out.println("Negative");
	}
	  
	}


}