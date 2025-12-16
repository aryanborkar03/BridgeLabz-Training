java.util.Scanner;
public class VolumeofaCylinder {
    public static void main(String[] args)
	Scanner sc = new Scanner(System.in);
	int r;
	int h;
	r = sc.nextint;
	h = sc.nextint;
	int volume = (3.14*(r*r)*h);
	System.out.println(volume);
	
}