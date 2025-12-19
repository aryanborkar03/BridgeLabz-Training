//Creating a class RocketLaunchedReverse so as to print the countdown of the rocket
import java.util.Scanner;
public class RocketLaunchedReverse{
    public static void main(String args[]) {
	
	//taking input as the value of variable counter
	Scanner sc = new Scanner(System.in);
	int counter = sc.nextInt();
	
	
	
	//using for loop to print the time left for rocket to launch
	
	for(int i = counter; i > 0; i--)
	{
		
		System.out.println("Rocket will be launched in: " +i);
	}
		
	}
} 