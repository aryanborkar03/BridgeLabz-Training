import java.util.Scanner;

public class CommonPrefixFinder {

    //find common prefix by shrinking from first word
    static String findPrefix(String[] words) {

        if(words.length == 0)
            return "";

        String prefix = words[0];
        int len = prefix.length();

        for(int i = 1; i < words.length; i++){
            String current = words[i];

            while(len > current.length() ||
                  !prefix.equals(current.substring(0, len))){

                len--;
                if(len == 0)
                    return "";

                prefix = prefix.substring(0, len);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.nextLine();
        }

        System.out.println(findPrefix(words));
    }
}
