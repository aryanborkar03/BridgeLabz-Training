//Created class to calculate BMI
import java.util.Scanner;
public class BMICalculator2D {

    public static String getStatus(double bmi){
        if(bmi <= 18.4) return "Underweight";
        else if(bmi <= 24.9) return "Normal";
        else if(bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for(int i=0;i<10;i++){
            data[i][0] = sc.nextDouble();   //weight
            data[i][1] = sc.nextDouble();   //height in cm

            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);
        }

        for(int i=0;i<10;i++){
            System.out.println(
                data[i][0]+" "+
                data[i][1]+" "+
                data[i][2]+" "+
                getStatus(data[i][2])
            );
        }
    }
}
