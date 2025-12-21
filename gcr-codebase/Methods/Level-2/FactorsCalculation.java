//Created class to find factors and calculations
import java.util.Scanner;
public class FactorsCalculation {

    //method to find factors and return array
    public static int[] findFactors(int number){
        int count = 0;

        for(int i=1;i<=number;i++){
            if(number%i==0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors){
        int sum = 0;
        for(int i=0;i<factors.length;i++)
            sum += factors[i];
        return sum;
    }

    public static long findProduct(int[] factors){
        long product = 1;
        for(int i=0;i<factors.length;i++)
            product *= factors[i];
        return product;
    }

    public static double findSumOfSquares(int[] factors){
        double sum = 0;
        for(int i=0;i<factors.length;i++)
            sum += Math.pow(factors[i],2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        for(int i=0;i<factors.length;i++)
            System.out.println(factors[i]);

        System.out.println(findSum(factors));
        System.out.println(findProduct(factors));
        System.out.println(findSumOfSquares(factors));
    }
}
