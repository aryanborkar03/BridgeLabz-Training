//Created class to calculate BMI and display status
import java.util.Scanner;
public class BMICalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        //taking input for weight and height
        for(int i=0;i<n;i++){
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        //calculating bmi and status
        for(int i=0;i<n;i++){
            bmi[i] = weight[i] / (height[i] * height[i]);

            if(bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if(bmi[i] <= 24.9)
                status[i] = "Normal";
            else if(bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        //displaying result
        for(int i=0;i<n;i++){
            System.out.println(height[i]+" "+weight[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
