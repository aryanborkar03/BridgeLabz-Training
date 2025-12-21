//Created class to generate random numbers and find average, min, max
public class RandomNumbersStats {

    public static int[] generate4DigitRandomArray(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = (int)(Math.random() * 1000) + 1;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double avg = (double)sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(numbers);

        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
