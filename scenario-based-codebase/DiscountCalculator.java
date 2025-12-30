import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double D5 = 0.05;
        final double D10 = 0.10;
        final double D15 = 0.15;

        int count = sc.nextInt();
        double bill = 0;

        //add all item prices
        for(int i = 0; i < count; i++){
            bill += sc.nextDouble();
        }

        double off = 0;

        //decide discount based on bill amount
        if(bill >= 1000)
            off = bill * D15;
        else if(bill >= 500)
            off = bill * D10;
        else if(bill >= 100)
            off = bill * D5;

        double payable = bill - off;

        System.out.println(bill);
        System.out.println(off);
        System.out.println(payable);
    }
}
