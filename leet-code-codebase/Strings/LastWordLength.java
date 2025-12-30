import java.util.Scanner;

public class LastWordLength {

    //find length of last word ignoring spaces at the end
    static int getLastWordLength(String text) {

        int i = text.length() - 1;

        while(i >= 0 && text.charAt(i) == ' ')
            i--;

        int count = 0;
        while(i >= 0 && text.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println(getLastWordLength(sentence));
    }
}
