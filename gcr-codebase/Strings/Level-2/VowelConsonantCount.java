import java.util.Scanner;
public class VowelConsonantCount {

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
        return "NotLetter";
    }

    //method to count vowels and consonants
    public static int[] countVowelsConsonants(String text){
        int vowels = 0, consonants = 0;

        for(int i=0;i<text.length();i++){
            String result = checkChar(text.charAt(i));
            if(result.equals("Vowel"))
                vowels++;
            else if(result.equals("Consonant"))
                consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] count = countVowelsConsonants(text);

        System.out.println(count[0]);
        System.out.println(count[1]);
    }
}
