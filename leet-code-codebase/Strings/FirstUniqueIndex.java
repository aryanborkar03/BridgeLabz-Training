import java.util.Scanner;

public class FirstUniqueIndex {

    //find index of first character that appears only once
    static int getFirstUnique(String text) {

        int[] count = new int[26];

        for(int i = 0; i < text.length(); i++){
            count[text.charAt(i) - 'a']++;
        }

        for(int i = 0; i < text.length(); i++){
            if(count[text.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(getFirstUnique(input));
    }
}
