public class ProfitLossPercentage{ 
    public static void main(String args[])
	{
		
	  //to calculate profitPercentage & profit	
	  double costPrice = 129;
	  double sellingPrice = 191;
	  double profit = sellingPrice-costPrice;
	  double profitPercentage = ((profit/costPrice)*100);
	  
	  //to print the cost,sellingPrice,profitPercentage & profit 
	  System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + " \nThe Profir is INR " + profit + " and the Profit Percentage is " + profitPercentage );
	  
	}
}