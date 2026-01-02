/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.Scanner;
public class DigitalWatchSimulation{
	public static void main(String[] args){
		for(int hour = 0; hour<24;hour++){
			for(int minutes = 0; minutes<24; minutes++){
				System.out.printf("%02d : %02d\n" , hour , minutes);
				
				if(hour==13)
				{
					break;
				}
			}
		}
	}
}