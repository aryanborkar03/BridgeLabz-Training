import java.util.Scanner;
public class CalculateTotalPrice{
    public static void main(String args[])
	{
		
	//to calculate total price fro unitPrice and quantity	
	 Scanner sc = new Scanner(System.in);
	 double unitPrice;
	 unitPrice = sc.nextInt();
	 double quantity;
	 quantity = sc.nextInt(); 
	 double totalPrice = (unitPrice*quantity);

    // to print the totalPrice of given  quantity 
	 System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	  
	}
}
