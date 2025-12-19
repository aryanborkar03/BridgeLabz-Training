//Creating a class ToFindTheSumOfNaturalNumbers to find the sum of natural numbers from given input
import java.util.Scanner;
public class ToFindTheSumOfNaturalNumbers{
    public static void main(String args[]){


    //to take input variables
    Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int sum = (number * (number+1) / 2);
	
	
	//to check if the number is natural or not nd apply nesessary conditions
	if(number <= 0)
	{
	 System.out.println("The Number " +number+ " is not Natural Number");
	}
	
	else
	{
	  System.out.println("The Number " +number+ " is  Natural Number");
	  System.out.println("The Sum of all Natural Numbers is: " +sum);

	}
	
	}
}