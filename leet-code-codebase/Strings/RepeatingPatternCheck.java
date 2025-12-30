import java.util.Scanner;

public class RepeatingPatternCheck {

    //check if string is made by repeating a smaller part
    static boolean hasRepeat(String text) {

        String temp = (text + text).substring(1, text.length() * 2 - 1);
        return temp.contains(text);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(hasRepeat(input));
    }
}
