package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Anuj", "Inception", "A10", "10:30 AM");
        system.addTicket(102, "Raju", "Avatar", "B12", "11:00 AM");
        system.addTicket(103, "Rahul", "Bahubali", "A11", "10:22 AM");

        system.displayTickets();

        System.out.println("\n--- Search by Customer ---");
        system.searchByCustomer("Anuj");

        System.out.println("\n--- Search by Movie ---");
        system.searchByMovie("Inception");

        System.out.println("\n--- Remove Ticket (ID = 102) ---");
        system.removeTicket(102);
        system.displayTickets();

        System.out.println("\n--- Count Tickets ---");
        system.countTickets();
    }
}