import java.util.Scanner;

public class SingleElement {

    //find the element that occurs only once
    static int getUnique(int[] numbers) {
        int result = 0;
        for (int x : numbers) {
            result ^= x;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println(getUnique(numbers));
    }
}
