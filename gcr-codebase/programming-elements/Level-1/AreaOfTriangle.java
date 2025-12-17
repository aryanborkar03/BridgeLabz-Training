import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);


 
	//calculating the area of the triangle
        int base = sc.nextInt();
        int height = sc.nextInt();
		double area = 0.5 * base * height;
        double areaCentimeters = area;   


    //To print the area of triangle in inches as well as in centimeters
        System.out.println(  "Area of triangle in Inches is " + areaInches +  " and in square centimetre is " + areaCentimeters );
    }
}

