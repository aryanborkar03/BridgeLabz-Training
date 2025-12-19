//Created class to find mean height of football players
import java.util.Scanner;
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        //taking height input
        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextDouble();
            sum=sum+heights[i];
        }

        //calculating mean
        double mean = sum / 11;
        System.out.println(mean);
    }
}
