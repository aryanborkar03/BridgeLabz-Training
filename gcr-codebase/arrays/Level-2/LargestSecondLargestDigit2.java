//Created class to store digits and find largest and second largest
import java.util.Scanner;
public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //store digits in array
        while(number != 0){
            if(index == maxDigit){
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                for(int i=0;i<digits.length;i++){
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        //find largest
        for(int i=0;i<index;i++){
            if(digits[i] > largest){
                largest = digits[i];
            }
        }

        //find second largest
        for(int i=0;i<index;i++){
            if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
