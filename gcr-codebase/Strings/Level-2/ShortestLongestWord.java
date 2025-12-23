import java.util.Scanner;
public class ShortestLongestWord {

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
        int wordCount = 1;

        for(int i=0;i<len;i++)
            if(text.charAt(i)==' ')
                wordCount++;

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                words[index++] = text.substring(start,i);
                start = i+1;
            }
        }
        words[index] = text.substring(start,len);
        return words;
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

    //method to find shortest and longest word index
    public static int[] findShortestLongest(String[][] table){
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);
        int minIndex = 0, maxIndex = 0;

        for(int i=1;i<table.length;i++){
            int len = Integer.parseInt(table[i][1]);
            if(len < min){
                min = len;
                minIndex = i;
            }
            if(len > max){
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex,maxIndex};
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        int[] result = findShortestLongest(table);

        System.out.println(table[result[0]][0]);
        System.out.println(table[result[1]][0]);
    }
}
