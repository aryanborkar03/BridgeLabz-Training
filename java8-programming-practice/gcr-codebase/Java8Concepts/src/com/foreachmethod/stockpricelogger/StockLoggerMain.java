package com.foreachmethod.stockpricelogger;

import java.time.LocalTime;
import java.util.*;

public class StockLoggerMain {
	public static void main( String args[] )
	{
		List<Stock> stockFeed = Arrays.asList(
	            new Stock("Goldfish", 175.50),
	            new Stock("Googles", 142.10),
	            new Stock("Amazon", 178.35),
	            new Stock("BurgerKing", 405.00),
	            new Stock("Tesla", 202.45)
	        );
		
		System.out.println("--- LIVE STOCK FEED STARTED ---");
		
		stockFeed.stream()
        .forEach(stock -> {
            // Simulating a log entry with a timestamp
            String timestamp = LocalTime.now().toString();
            System.out.println(timestamp + " | INFO | " + stock);
        });
		
		System.out.println("--- FEED ENDED ---");
	}
}
