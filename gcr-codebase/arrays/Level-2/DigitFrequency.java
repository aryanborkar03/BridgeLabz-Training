//Created class to find frequency of digits in a number
import java.util.Scanner;
public class DigitFrequency {
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
        int[] freq = new int[10];

        //storing digits
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }

        //finding frequency
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }

        //displaying frequency
        for(int i=0;i<10;i++){
            if(freq[i]>0)
                System.out.println(i+" "+freq[i]);
        }
    }
}
