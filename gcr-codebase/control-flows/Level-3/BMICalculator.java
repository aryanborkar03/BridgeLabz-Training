//Created class Named BMICalculator
import java.util.Scanner;
public class BMICalculator{
   public static void main(String[]args){

    //take weight and height from the user
    Scanner sc=new Scanner(System.in);
    double weight=sc.nextDouble();
    double heightCm=sc.nextDouble();

    //convert height from cm to meter and calculate BMI
    double heightMeter=heightCm/100;
    double bmi=weight/(heightMeter*heightMeter);

    //print the status according BMI value
    if(bmi>=40){
	System.out.println("Obese");
	}
	else if(bmi>=25 && bmi<=39.9){
	System.out.println("Overweight");
	}
	else if(bmi>=18.5 && bmi<=24.9){
	System.out.println("Normal");
	}
	else{
	System.out.println("Underweight");
	}
   }
}
