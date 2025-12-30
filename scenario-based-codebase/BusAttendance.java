import java.util.Scanner;

public class BusAttendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {
            "Aman","Riya","Rahul","Neha","Arjun",
            "Pooja","Karan","Simran","Vikram","Anjali"
        };

        int present = 0;
        int absent = 0;

        //count present and absent students
        for(int i = 0; i < names.length; i++){
            String status = sc.next();

            if(status.equalsIgnoreCase("Present"))
                present++;
            else
                absent++;
        }

        System.out.println(present);
        System.out.println(absent);
    }
}
