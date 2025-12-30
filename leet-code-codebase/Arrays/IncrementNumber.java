import java.util.Scanner;

public class IncrementNumber {

    //adds one to the number stored as digits
    static int[] addOne(int[] arr) {

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] digits = new int[n];

        for(int i = 0; i < n; i++){
            digits[i] = sc.nextInt();
        }

        int[] result = addOne(digits);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
