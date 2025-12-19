//Created class to check number type and compare elements
import java.util.Scanner;
public class CheckNumberAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //taking input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //checking numbers
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            }
            else if(arr[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }

        //comparing first and last element
        if(arr[0]==arr[4])
            System.out.println("Equal");
        else if(arr[0]>arr[4])
            System.out.println("First Greater");
        else
            System.out.println("Last Greater");
    }
}
