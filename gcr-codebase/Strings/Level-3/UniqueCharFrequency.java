import java.util.Scanner;
public class UniqueCharFrequency {

    //find unique characters using nested loops
    public static char[] uniqueCharacters(String text){
        char[] temp = new char[text.length()];
        int index = 0;

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            boolean isUnique = true;

            for(int j=0;j<i;j++){
                if(text.charAt(j) == ch){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
                temp[index++] = ch;
        }

        char[] result = new char[index];
        for(int i=0;i<index;i++)
            result[i] = temp[i];

        return result;
    }

    //find frequency using ASCII array and unique characters
    public static String[][] findFrequency(String text){
        int[] freq = new int[256];

        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for(int i=0;i<unique.length;i++){
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); 

        String[][] data = findFrequency(text);

        for(int i=0;i<data.length;i++)
            System.out.println(data[i][0] + "\t" + data[i][1]);
    }
}
 