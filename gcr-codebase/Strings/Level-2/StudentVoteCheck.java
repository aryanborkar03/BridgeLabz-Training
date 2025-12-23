public class StudentVoteCheck {

    //generate random 2-digit ages
    public static int[] generateAges(int n){
        int[] ages = new int[n];
        for(int i=0;i<n;i++)
            ages[i] = (int)(Math.random()*90) + 10;
        return ages;
    }

    //check voting eligibility
    public static String[][] checkVote(int[] ages){
        String[][] result = new String[ages.length][2];

        for(int i=0;i<ages.length;i++){
            result[i][0] = String.valueOf(ages[i]);

            if(ages[i] < 0)
                result[i][1] = "false";
            else if(ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }
        return result;
    }

    //display result in table
    public static void display(String[][] data){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args){

        int students = 10;

        int[] ages = generateAges(students);
        String[][] result = checkVote(ages);
        display(result);
    }
}
