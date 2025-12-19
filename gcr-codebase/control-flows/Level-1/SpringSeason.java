//Creating a Class SpringSeason to check if the month is spring or not 
import java.util.Scanner;
public class SpringSeason{
    public static void main(String args[]) {
	
// to take input variables month and day
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	int day = sc.nextInt();
	
	
//to use if else statements to solve the conditions
	if((month ==3 && day <=20 && day >=1)||
	  (month ==4 && day <=30 && day >=1)||
	  (month ==5 && day <=31 && day >=1)||
	  (month ==6 && day <=20 && day >=1))
	  {
	   System.out.println("SpringSeason");
	  }
	  
	else
	{
	  System.out.println("Not SpringSeason");
	}
	}
}