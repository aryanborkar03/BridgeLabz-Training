//Created class to print multiplication table using array
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];

        //storing multiplication values
        for(int i=1;i<=10;i++){
            table[i-1]=number*i;
        }

        //printing multiplication table
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+table[i-1]);
        }
    }
}
