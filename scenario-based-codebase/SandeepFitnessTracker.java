import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Push-ups Tracker");
        System.out.println("Enter the number of Push-ups per day");
        System.out.println("Type \"0\" if you want a rest day");

        int activeDays = 0;
        int totalPushups = 0;
        int[] days = new int[7];

        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " + (i + 1) + " :");
            days[i] = sc.nextInt();
        }

        for (int num : days) {
            if (num == 0) continue;
            totalPushups += num;
            activeDays++;
        }

        if (activeDays > 0) {
            int avg = totalPushups / activeDays;
            System.out.println(  "Active Days: " + activeDays +
                "\nAverage Push-ups: " + avg +
                "\nTotal Push-ups: " + totalPushups
            );
			
			
			
			
			
        } else {
            System.out.println("No active days recorded.");
        }
    }
}
