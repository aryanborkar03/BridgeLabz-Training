import java.util.Scanner;
public class MaximumNumberOfHandshake{
    public static void main(String args[])
	{ 
	 
	 //to find max number of handshakes possible
	 Scanner sc = new Scanner(System.in);
	 int numberOfStudents;
	 numberOfStudents = sc.nextInt();
	 int totalHandshakes = ((numberOfStudents * (numberOfStudents - 1)) / 2);
	 
	 //to print number of handshakes
	 System.out.println("Number of Possible Handshakes: " + totalHandshakes );
	  
	}
}
