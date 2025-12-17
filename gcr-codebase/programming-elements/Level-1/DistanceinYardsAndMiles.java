import java.util.Scanner;
public class  DistanceinYardsAndMiles{
    public static void main(String args[])
	{
	 //to convert distance in feet to miles and yard
	 Scanner sc = new Scanner(System.in);
	 float distanceInFeet;
	 distanceInFeet = sc.nextFloat();
     float miles = (distanceInFeet/5280);   
	 float yards = (distanceInFeet/3);
	 
	 //to print converted values
	 System.out.println("The distance in Yards and Miles is " + yards + " & "  + miles);

	  
	}
}
