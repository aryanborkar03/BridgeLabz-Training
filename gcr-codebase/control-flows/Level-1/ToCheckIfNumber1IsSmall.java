//Creating CheckIfNumber1lsSmall class to find if number1 is the smallest
import java.util.Scanner;
public class CheckIfNumber1lsSmall.java {
    public static void main(String args[]){


    //taking input variables
    Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();  
	int large;
	
	
	
	//Comparing values of the variables to find the smallest number
	if(number1 < number2 && number1 < number3)
	{
		System.out.println("The number " +number1+  " is the smallest"); 
	}

    else  
	{
		System.out.println("The number " +number1+  " is not the smallest");
	}
}
}