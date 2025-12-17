public class VolumeOfEarth{
    public static void main(String[]args){
		
		//to print the volume of earth and doing appropriate conversions
        int radiusOfEarth=6378;
        double volumeofearthincubickm=(4/3)*3.14*radiusOfEarth*radiusOfEarth*radiusOfEarth;
        double volumeofearthincubicmiles=volumeofearthincubickm/1.6;
		
		//to print volume of earth in volumeofearthincubickm
        System.out.println("The volume of earth in cubic kilometers is "+volumeofearthincubickm+" and and cubic miles is "+volumeofearthincubicmiles);
    }
}