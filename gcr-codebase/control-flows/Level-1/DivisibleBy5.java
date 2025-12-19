//Creating a Divisibleby5 class to check if the input is divisible by 5 or not 
import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String args[]){

    //taking the input variables
    Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	//applying necessary conditions to chek if number divisble by 5 or not
	if(number%5 == 0)
	{
	  System.out.println("The number " + number + "is divisible by 5");
	}
	else
	{
	  System.out.println("The number " + number + " is not divisible by 5" );
	}


}
}