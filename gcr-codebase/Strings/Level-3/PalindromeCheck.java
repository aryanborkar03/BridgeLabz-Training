import java.util.Scanner;
public class PalindromeCheck {

    //logic 1: using start and end index
    public static boolean isPalindromeLoop(String text){
        int start = 0; 
        int end = text.length() - 1;

        while(start < end){
            if(text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    //logic 2: using recursion
    public static boolean isPalindromeRecursive(String text,int start,int end){
        if(start >= end)
            return true;

        if(text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text,start+1,end-1);
    }

    //reverse string using charAt()
    public static char[] reverseString(String text){
        char[] rev = new char[text.length()];
        int j = 0;

        for(int i=text.length()-1;i>=0;i--)
            rev[j++] = text.charAt(i);

        return rev;
    }

    //logic 3: using character arrays
    public static boolean isPalindromeArray(String text){
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for(int i=0;i<original.length;i++){
            if(original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeLoop(text));
        System.out.println(isPalindromeRecursive(text,0,text.length()-1));
        System.out.println(isPalindromeArray(text));
    }
}
