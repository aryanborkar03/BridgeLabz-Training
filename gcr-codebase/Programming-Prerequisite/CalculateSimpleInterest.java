import.java.util.Scanner;
public class CalculateSimpleInterest{
    public static void main(String[] args)
	Scanner sc = new Scanner(System.in);
	int principal;
	principal = sc.nextint;
	int rate;
	rate = sc.nextint;
	int time;
	time = sc.nextint;
	int intrest = (principal*rate*time)/100;
	System.out.println(intrest);
}