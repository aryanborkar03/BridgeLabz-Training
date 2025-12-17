import java.util.Scanner;
public class HeightConversion{
    public static void main(String[]args){
		
	
	//to convert given height into different unit, height is taken in cm
	Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
		double inch=height/2.54;
		int heightininch=(int)inch;
        int feet=heightininch/12;
		int inches=heightininch%12;
		
	//to print converted values	
		System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    }
}