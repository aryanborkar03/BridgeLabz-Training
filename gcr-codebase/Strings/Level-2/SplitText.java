import java.util.Scanner;
public class SplitText {

    //method to find length without using length()
    public static int findLength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }
        catch(Exception e){
            return count;
        }
    }

    //method to split text into words using charAt()
    public static String[] splitText(String text){
        int len = findLength(text);
        int wordCount = 1;

        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                wordCount++;
        }

        int[] spaceIndex = new int[wordCount-1];
        int k = 0;

        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                spaceIndex[k++] = i;
        }

        String[] words = new String[wordCount];
        int start = 0;

        for(int i=0;i<spaceIndex.length;i++){
            words[i] = text.substring(start,spaceIndex[i]);
            start = spaceIndex[i]+1;
        }
        words[wordCount-1] = text.substring(start,len);

        return words;
    }

    //method to compare two string arrays
    public static boolean compareArrays(String[] a,String[] b){
        if(a.length != b.length)
            return false;

        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println(compareArrays(userSplit,builtInSplit));
    }
}
