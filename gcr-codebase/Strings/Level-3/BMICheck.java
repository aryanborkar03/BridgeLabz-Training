import java.util.Scanner;
public class BMICheck {

    //calculate BMI and status
    public static String[][] calculateBMI(double[][] data){
        String[][] result = new String[10][4];

        for(int i=0;i<10;i++){
            double heightMeter = data[i][1] / 100;
            double bmi = data[i][0] / (heightMeter * heightMeter);

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.valueOf(Math.round(bmi*100.0)/100.0);

            if(bmi <= 18.4)
                result[i][3] = "Underweight";
            else if(bmi <= 24.9)
                result[i][3] = "Normal";
            else if(bmi <= 39.9)
                result[i][3] = "Overweight";
            else
                result[i][3] = "Obese";
        }
        return result;
    }

    //display result
    public static void display(String[][] data){
        System.out.println("Height\tWeight\tBMI\tStatus");
        for(int i=0;i<data.length;i++){
            System.out.println(
                data[i][0]+"\t"+
                data[i][1]+"\t"+
                data[i][2]+"\t"+
                data[i][3]
            );
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];

        for(int i=0;i<10;i++){
            personData[i][0] = sc.nextDouble(); //weight
            personData[i][1] = sc.nextDouble(); //height
        }

        String[][] result = calculateBMI(personData);
        display(result);
    }
}
