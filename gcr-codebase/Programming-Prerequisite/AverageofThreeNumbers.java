import java.util.Scanner;
public class AverageofThreeNumbers {
    public static void main (String[] args)
	{   
	    Scanner sc = new Scanner(System.in);
        int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
        c = sc.nextInt();
        int avg = ((a+b+c)/3);
		System.out.println(avg);
        

		
	}

}