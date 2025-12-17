import java.util.Scanner;
public class DistanceConversion{
	
	//to convert Km to input
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	double km=sc.nextInt();
	double miles=km/1.6;
	
	//to print total miles and km
	System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
    }
}