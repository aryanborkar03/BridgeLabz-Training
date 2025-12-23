import java.util.Scanner;
public class WordLengthTable {

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
    public static String[] splitWords(String text){
        int len = findLength(text);
        int words = 1;

        for(int i=0;i<len;i++)
            if(text.charAt(i)==' ')
                words++;

        String[] result = new String[words];
        int start = 0, index = 0;

        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                result[index++] = text.substring(start,i);
                start = i+1;
            }
        }
        result[index] = text.substring(start,len);
        return result;
    }

    //method to create 2D array of word and length
    public static String[][] wordLengthTable(String[] words){
        String[][] table = new String[words.length][2];

        for(int i=0;i<words.length;i++){
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);

        for(int i=0;i<table.length;i++){
            System.out.println(
                table[i][0]+"\t"+
                Integer.parseInt(table[i][1])
            );
        }
    }
}
