import java.util.Scanner;

public class PalindromeCheck {

    //check palindrome by comparing from both ends
    static boolean checkPalindrome(String text) {

        text = text.toLowerCase();

        String clean = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                clean = clean + ch;
            }
        }

        int left = 0;
        int right = clean.length() - 1;

        while(left < right){
            if(clean.charAt(left) != clean.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(checkPalindrome(input));
    }
}
