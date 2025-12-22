import java.util.Scanner;
public class TrimString {

    //find start and end index without spaces
    public static int[] findTrimIndex(String text){
        int start = 0, end = text.length() - 1;

        while(text.charAt(start) == ' ')
            start++;

        while(text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    //create substring using charAt()
    public static String makeSubstring(String text,int start,int end){
        String result = "";
        for(int i=start;i<=end;i++)
            result = result + text.charAt(i);
        return result;
    }

    //compare two strings using charAt()
    public static boolean compareStrings(String a,String b){
        if(a.length() != b.length())
            return false;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] index = findTrimIndex(text);
        String trimmed1 = makeSubstring(text,index[0],index[1]);
        String trimmed2 = text.trim();

        System.out.println(compareStrings(trimmed1, trimmed2));
    }
}
