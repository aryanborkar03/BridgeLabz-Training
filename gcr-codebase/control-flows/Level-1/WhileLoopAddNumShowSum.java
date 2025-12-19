//Creating a class WhileLoopAddNumShowSum to calculate the sum of numbers using while loop and break
import java.util.Scanner;
public class WhileLoopAddNumShowSum{
    public static void main(String args[]) {
	
	//taking input from the user and initializing total to zero
	Scanner sc = new Scanner(System.in);
	double total = 0.0;
	double userinput = sc.nextDouble();
	
	
	
	//using infinite while loop to add numbers until zero or negative is entered
	while(true)
	{
		total = total + userinput;
		
		
		if(userinput <= 0)
			break;
		
		userinput = sc.nextDouble();
	}
	
	
	//printing the final sum
	
	System.out.println("Sum = " + total);
		
	}
}
