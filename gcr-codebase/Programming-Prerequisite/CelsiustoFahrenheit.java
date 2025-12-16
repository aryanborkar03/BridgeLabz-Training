import java.util.Scanner;
public class CelsiustoFahrenheit{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	double celsius;
	celsius = sc.nextInt();
	double  Fahrenheit = ((celsius * 9/5) + 32);
	System.out.println(Fahrenheit);}
}