//Created class to store numbers and calculate sum
import java.util.Scanner;
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        //taking input until condition fails
        while(true){
            double num = sc.nextDouble();
            if(num<=0 || index==10)
                break;
            arr[index]=num;
            index++;
        }

        //printing values and sum
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
            total=total+arr[i];
        }
        System.out.println(total);
    }
}
