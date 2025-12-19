//Creating a class CheckIfEligibleToVote to check if the user can vote
import java.util.Scanner;
public class CheckIfEligibleToVote {
    public static void main(String args[]){


    //to take the age as input variable
    Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
	
	
	//to check if age is greater than 18 or not to determine eligibility
	if(age >= 18)
	{
	  System.out.println(" The person's age is " +age + " and he can  vote.");
	}
	
	else
	{
	 System.out.println(" The person's age is " +age + " and he cannot vote.");
	}
	  
	}


}