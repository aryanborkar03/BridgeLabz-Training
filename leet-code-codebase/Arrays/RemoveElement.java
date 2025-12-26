import java.util.Scanner;

public class RemoveElement {

    //Method to remove all occurrences of a given value and return new length
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            
			}  
			
        }
        return count;
    }
	
	//Method to find the updated list of elements with removed variables.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int value = sc.nextInt();

        int length = removeElement(nums, value);

        System.out.println("New length after removing element: " + length);
        System.out.print("Updated array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}