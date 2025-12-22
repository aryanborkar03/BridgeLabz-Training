//Created class to find smallest and largest of three numbers
import java.util.Scanner;
public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int n1,int n2,int n3){
        int smallest = n1;
        int largest = n1;

        if(n2 < smallest)
            smallest = n2;
        if(n3 < smallest)
            smallest = n3;

        if(n2 > largest)
            largest = n2;
        if(n3 > largest)
            largest = n3;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int[] result = findSmallestAndLargest(number1,number2,number3);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
