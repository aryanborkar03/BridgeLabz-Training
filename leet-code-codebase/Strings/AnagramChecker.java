import java.util.Scanner;

public class AnagramChecker {

    //check anagram using character count
    static boolean checkAnagram(String first, String second) {

        if(first.length() != second.length())
            return false;

        int[] count = new int[26];

        for(int i = 0; i < first.length(); i++){
            count[first.charAt(i) - 'a']++;
            count[second.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(checkAnagram(s1, s2));
    }
}
