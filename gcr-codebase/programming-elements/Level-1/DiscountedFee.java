import java.util.Scanner;
public class DiscountedFee{
    public static void main(String[]args){


	//to calculate the discounted percentage
	Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=input.nextInt();
        int discount=fee*discountPercent/100;
        int finaldiscountedfee=fee-discount;



    //to print the discounted amount
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finaldiscountedfee);
    }
}