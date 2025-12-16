import.java.util.Scanner;
public class PerimeterofaRectangle{
    public static void main(String[] args)
	Scanner sc = new Scanner(System.in);
	int length;
	length = sc.nextint;
	int width;
	width = sc.nextint;
	int Perimeter = 2 * (length + width);
	System.out.println(Perimeter);
}