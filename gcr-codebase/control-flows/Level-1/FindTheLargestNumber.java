//Creating FindTheLargestNumber to find the largest number
import java.util.Scanner;
public class FindTheLargestNumber {
    public static void main(String args[]){


    //to take the input variables 
    Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
  
	
	
	//If else statements to check which is the largest number
	if(number1 > number2 && number1 > number3)
	{
	 System.out.println("Is the first number the largest? YES" + 
	 "\nIs the second number the largest? NO" + 
	 "\nIs the third number the largest? NO");
	}
	
	
	else if(number2 > number1 && number2 > number3)
	{
	 System.out.println("Is the first number the largest? NO" + 
	 "\nIs the second number the largest? YES" + 
	 "\nIs the third number the largest? NO");
	}


    else 
	{
	 System.out.println("Is the first number the largest? NO" + 
	 "\nIs the second number the largest? NO" + 
	 "\nIs the third number the largest? YES");
	}

	}


}