import java.util.Scanner;
public class  DoubleOpt{
public static void main(String args[])
	{
     Scanner sc = new Scanner(System.in);
	 
	 
	//to perform double operations using operator precedence
 
	 double a;
	 a = sc.nextDouble();
     double b;
     b = sc.nextDouble();
     double c;
     c = sc.nextDouble();
     double result1 = a + b * c;
	 double result2 = a * b + c;
	 double result3 = c + a / b;
	 double result4 = a % b + c;
	 
	 
	 
	 //to print the results of double operations
	 System.out.println("a + b * c = " + result1);
	 System.out.println("a * b + c = " + result2);
	 System.out.println("c + a / b = " + result3);
	 System.out.println("a % b + c = " + result4);

	  
	}
}
