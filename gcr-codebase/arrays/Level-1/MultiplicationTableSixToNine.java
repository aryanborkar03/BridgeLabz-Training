//Created class to print multiplication table from 6 to 9
import java.util.Scanner;
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];

        //storing multiplication results
        for(int i=6;i<=9;i++){
            multiplicationResult[i-6]=number*i;
        }

        //displaying results
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+multiplicationResult[i-6]);
        }
    }
}
