import java.util.Scanner;

public class RomanToInteger {

    // Method to convert Roman numeral to Integer
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            // check next character for subtraction case
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                total = total - current;
            } else {
                total = total + current;
            }
        }

        return total;
    }

    // method to get value of a Roman character
    public  int getValue(char ch) {
        if (ch == 'I') 
			return 1;
        if (ch == 'V') 
			return 5;
        if (ch == 'X') 
			return 10;
        if (ch == 'L') 
			return 50;
        if (ch == 'C') 
			return 100;
        if (ch == 'D') 
			return 500;
        if (ch == 'M')
			return 1000;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine();

        RomanToInteger obj = new RomanToInteger();
        int result = obj.romanToInt(s);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}
