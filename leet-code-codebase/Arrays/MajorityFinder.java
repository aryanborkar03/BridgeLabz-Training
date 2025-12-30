import java.util.Scanner;

public class MajorityFinder {

    //logic to find element appearing more than n/2 times
    static int findMajority(int[] arr) {
        int element = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                element = arr[i];
                count = 1;
            }
            else if(arr[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMajority(arr));
    }
}
