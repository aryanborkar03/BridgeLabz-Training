import java.util.Scanner;
public class VolumeofaCylinder {
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	double r;
	double h;
	r = sc.nextInt();
	h = sc.nextInt();
	double volume = (3.14*(r*r)*h);
	System.out.println(volume);}
	
}