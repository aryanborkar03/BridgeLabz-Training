package com.constructors.Level1;

public class HotelBooking {
	
	    String guestName;
	    String roomType;
	    int nights;

	    // default constructor
	    HotelBooking() {
	        this("Guest","Standard",1);
	    }

	    // parameterized constructor
	    HotelBooking(String g,String r,int n) {
	        guestName = g;
	        roomType = r;
	        nights = n;
	    }

	    // copy constructor
	    HotelBooking(HotelBooking h) {
	        this(h.guestName,h.roomType,h.nights);
	    }

	    void displayBooking() {
	        System.out.println(guestName);
	        System.out.println(roomType);
	        System.out.println(nights);
	    }

	    public static void main(String[] args) {
	        HotelBooking b1 = new HotelBooking("Rahul","Deluxe",3);
	        HotelBooking b2 = new HotelBooking(b1);

	        b2.displayBooking();
	    }
	}


