public class PenDistribution{
    public static void main(String[]args){
		
		//to do pen distribution, 
        int totalNumberofPens=14;
        int numberOfStudents=3;
        int penPerStudent=14/3;
        int remainingPen=14%3;
		
		//to print pens per students as well as pens not distributed;
        System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPen);
    }
}