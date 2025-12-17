import java.util.Scanner;
public class  PerimeterOfSquare{
    public static void main(String args[])
	{
	 //to find side from perimeter of the square
	 Scanner sc = new Scanner(System.in);
	 int perimeter;
	 perimeter = sc.nextInt();
     int side = (perimeter/4);
	 
	 //to print the side of the square & perimeter
	 System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);

	  
	}
}
