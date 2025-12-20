//Created class to reverse a number using array
import java.util.Scanner;
public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        //counting digits
        while(temp!=0){
            count++;
            temp=temp/10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        //storing digits
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }

        //reversing array
        for(int i=0;i<count;i++){
            reverse[i]=digits[count-1-i];
        }

        //printing reversed number
        for(int i=0;i<count;i++){
            System.out.print(reverse[i]);
        }
    }
}
