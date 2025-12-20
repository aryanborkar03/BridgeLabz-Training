//Created class to calculate BMI using 2D array
import java.util.Scanner;
public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        //taking input for weight and height
        for(int i=0;i<number;i++){
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if(weight<=0 || height<=0){
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        //calculating bmi and status
        for(int i=0;i<number;i++){
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if(personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if(personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if(personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        //displaying result
        for(int i=0;i<number;i++){
            System.out.println(personData[i][1]+" "+personData[i][0]+" "+personData[i][2]+" "+weightStatus[i]);
        }
    }
}
