public class DiscountedPrice{
    public static void main(String[]args){
		
		//to find discounted and calcualte discounted price
        int fee=125000;
        int discountPercent=10;
        int discount=fee*discountPercent/100;
        int finaldiscountedfee=fee-discount;
		
		//to print the discounted price
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finaldiscountedfee);
    }
}