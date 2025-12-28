import java.util.Scanner;

public class NoteBuilder {

    //check if note can be formed from given text
    static boolean canMake(String note, String text) {

        int[] count = new int[26];

        for(int i = 0; i < text.length(); i++){
            count[text.charAt(i) - 'a']++;
        }

        for(int i = 0; i < note.length(); i++){
            if(count[note.charAt(i) - 'a'] == 0)
                return false;
            count[note.charAt(i) - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String note = sc.nextLine();
        String text = sc.nextLine();

        System.out.println(canMake(note, text));
    }
}
