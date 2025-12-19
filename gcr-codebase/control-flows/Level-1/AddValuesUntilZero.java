//Creating a class AddValuesUntilZero to calculate the sum of numbers entered by the user
import java.util.Scanner;
public class AddValuesUntilZero{
    public static void main(String args[]) {
	
	//taking input from the user and initializing total to zero
	Scanner sc = new Scanner(System.in);
	double total = 0.0;
	double userinput = sc.nextDouble();
	
	
	
	//using while loop to add numbers until the user enters zero
	while(userinput != 0)
	{
		total = total + userinput;
		userinput = sc.nextDouble();
	}
	
	
	//printing the final sum after the loop ends
	System.out.println("Sum = " + total);
		
	}
}
