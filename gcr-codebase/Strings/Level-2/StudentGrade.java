public class StudentGrade {

    //generate random PCM marks
    public static int[][] generateMarks(int n){
        int[][] marks = new int[n][3];
        for(int i=0;i<n;i++){
            marks[i][0] = (int)(Math.random()*90)+10;
            marks[i][1] = (int)(Math.random()*90)+10;
            marks[i][2] = (int)(Math.random()*90)+10;
        }
        return marks;
    }

    //calculate total, average and percentage
    public static double[][] calculateResult(int[][] marks){
        double[][] result = new double[marks.length][3];

        for(int i=0;i<marks.length;i++){
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    //calculate grade
    public static String[] calculateGrade(double[][] result){
        String[] grade = new String[result.length];

        for(int i=0;i<result.length;i++){
            double p = result[i][2];

            if(p >= 80) grade[i] = "A";
            else if(p >= 70) grade[i] = "B";
            else if(p >= 60) grade[i] = "C";
            else if(p >= 50) grade[i] = "D";
            else if(p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    //display scorecard
    public static void display(int[][] marks,double[][] result,String[] grade){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for(int i=0;i<marks.length;i++){
            System.out.println(
                marks[i][0]+"\t"+
                marks[i][1]+"\t"+
                marks[i][2]+"\t"+
                result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]+"\t"+
                grade[i]
            );
        }
    }

    public static void main(String[] args){

        int students = 5;

        int[][] marks = generateMarks(students);
        double[][] result = calculateResult(marks);
        String[] grade = calculateGrade(result);

        display(marks,result,grade);
    }
}
