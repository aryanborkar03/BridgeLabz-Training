import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		//used a for loop to take as input the duedate and returndate
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the Due Date & Return Date of the Books: ");
            int dueDate = sc.nextInt();
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;
                System.out.println("Book " + i + " Fine: ₹" + fine);
            } else {
                System.out.println("Book " + i + " Fine: ₹0");
            }
        }
    }
}
