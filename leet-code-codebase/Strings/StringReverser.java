import java.util.Scanner;

public class StringReverser {

    //reverse characters using two pointers
    static void reverseChars(char[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        reverseChars(chars);

        System.out.println(new String(chars));
    }
}
