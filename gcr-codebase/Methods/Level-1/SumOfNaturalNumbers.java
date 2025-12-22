//Created class to find sum of n natural numbers
import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static int findSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = findSum(n);
        System.out.println(result);
    }
}
