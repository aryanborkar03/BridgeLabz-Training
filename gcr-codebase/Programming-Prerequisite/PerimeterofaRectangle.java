import java.util.Scanner;
public class PerimeterofaRectangle{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int length;
	length = sc.nextInt();
	int width;
	width = sc.nextInt();
	int Perimeter = 2 * (length + width);
	System.out.println(Perimeter);}
}
