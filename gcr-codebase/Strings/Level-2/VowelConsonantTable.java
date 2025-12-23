import java.util.Scanner;
public class VowelConsonantTable {

    //method to check character type
    public static String checkChar(char ch){
        if(ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if(ch >= 'a' && ch <= 'z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    //method to store character and its type in 2D array
    public static String[][] findCharType(String text){
        String[][] result = new String[text.length()][2];

        for(int i=0;i<text.length();i++){
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkChar(text.charAt(i));
        }
        return result;
    }

    //method to display 2D array
    public static void display(String[][] data){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = findCharType(text);
        display(data);
    }
}
