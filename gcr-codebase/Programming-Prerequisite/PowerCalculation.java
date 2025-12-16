import java.util.Scanner;
public class PowerCalculation{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
	double base;
	base = sc.nextInt();
	double expo;
	expo = sc.nextInt();
	double result = Math.pow(base,expo) ;
	System.out.println(result); }
   
}