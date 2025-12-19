//Creating a class RocketLaunched to give the uder countdown of the launch of the rocket
import java.util.Scanner;
public class RocketLaunched{
    public static void main(String args[]) {
	
	//taking input as the value of variable counter
	Scanner sc = new Scanner(System.in);
	int counter = sc.nextInt();
	
	
	
	//using while loop to print the time left for rocket to launch
	System.out.println(counter);
	while(counter!=1)
	{
	  counter-=1;
	  System.out.println("\nRocket will be launched in: " +counter);
	} 
	
	
	}
} 