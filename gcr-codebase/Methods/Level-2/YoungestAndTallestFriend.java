//Created class to find youngest and tallest friend
import java.util.Scanner;
public class YoungestAndTallestFriend {

    public static int findYoungest(int[] age){
        int min = 0;
        for(int i=1;i<age.length;i++){
            if(age[i] < age[min])
                min = i;
        }
        return min;
    }

    public static int findTallest(double[] height){
        int max = 0;
        for(int i=1;i<height.length;i++){
            if(height[i] > height[max])
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar","Akbar","Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        System.out.println(names[youngestIndex]);
        System.out.println(names[tallestIndex]);
    }
}
