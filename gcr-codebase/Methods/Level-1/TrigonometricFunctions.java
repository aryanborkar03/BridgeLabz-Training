//Created class to calculate trigonometric functions
import java.util.Scanner;
public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);
        double sin = Math.sin(radian);
        double cos = Math.cos(radian);
        double tan = Math.tan(radian);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
