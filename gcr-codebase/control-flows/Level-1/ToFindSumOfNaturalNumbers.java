//Creating a Class ToFindSumOfNaturalNumbers to print values using formula and while loop
import java.util.Scanner;
public class ToFindSumOfNaturalNumbers{
    public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int sum1 =( n*(n+1)/2);
    int sum2=0; 

//using while loop to print sum of n numbers
if(n >0)
{   
    int i =1;
    while(i<=n)
    {
        sum2 = sum2+i;
        i++;
    }
    
}
	
	
	
//if statement to print values
    if(sum2==sum1)
	{System.out.println("Both are correct");
	System.out.println(sum2 +" "+ sum1);}
		
	}
}
