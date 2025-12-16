import java.util.Scanner;
public class CalculateSimpleInterest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int principal;
	principal = sc.nextInt();
	int rate;
	rate = sc.nextInt();
	int time;
	time = sc.nextInt();
	int intrest = (principal*rate*time)/100;
	System.out.println(intrest);}
}