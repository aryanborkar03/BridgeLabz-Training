package com.callcentre;
import java.util.*;
public class Manager {
      
	   Queue<Customer> normalQueue = new LinkedList<>();
	   PriorityQueue<Customer> vipQueue = new PriorityQueue<>( 
			   new Comparator<Customer>() {
				   public int comapre(Customer c1, Customer c2) {
					   return c1.callTime - c2.callTime;
				   }

				   @Override
				public int compare(Customer o1, Customer o2) {
					// TODO Auto-generated method stub
					return 0;
				}
			   }
			   );
	   HashMap <String , Integer> callCountMap = new HashMap<>();
	   public void addCustomers(Customer customer)
	   {
		   callCountMap.put(
				   customer.name,
				   callCountMap.getOrDefault(customer.name , 0 ) + 1 
				   
				   );
		   
		   
		   if(customer.VIP)
		   {
			   vipQueue.offer(customer);
		   }
		   
		   else
		   {
			   normalQueue.offer(customer);
;		   }
	   }
	   
	   public void handleCall() {
		   Customer customer;
		   
		   if(vipQueue.isEmpty()) {
			   customer = vipQueue.poll();
		   }
		   
		   else if (normalQueue.isEmpty())
		   { 
			  customer = normalQueue.poll();
		   }
		   
		   else {
			   
			   System.out.println("No Calls in Queue");
			   return;
			   
		   }
			   System.out.println("Handling calls of :" + customer.name);
		   }
	   
	   public void ShowCallCounts() {
		   
		   for(String name : callCountMap.keySet()) {
			   
			   System.out.println(name + " called " + callCountMap.get(name) + " times");
	   }
	   }
	   
	   
}