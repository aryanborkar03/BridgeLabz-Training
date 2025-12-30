import java.util.Scanner;

public class WordReverser {

    //reverse each word but keep word order same
    static String reverseEachWord(String line) {

        String result = "";
        String word = "";

        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if(ch != ' ')
                word = ch + word;
            else{
                result = result + word + " ";
                word = "";
            }
        }
        result = result + word;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println(reverseEachWord(sentence));
    }
}
