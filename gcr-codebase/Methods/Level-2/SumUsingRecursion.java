//Created class to compare sum using recursion and formula
import java.util.Scanner;
public class SumUsingRecursion {

    public static int sumRecursive(int n){
        if(n==0)
            return 0;
        return n + sumRecursive(n-1);
    }

    public static int sumFormula(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid");
            return;
        }

        int sum1 = sumRecursive(n);
        int sum2 = sumFormula(n);

        System.out.println(sum1);
        System.out.println(sum2);

        if(sum1==sum2)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
