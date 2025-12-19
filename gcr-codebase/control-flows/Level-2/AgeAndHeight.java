//Created class Named AgeAndHeight to print height and age
import java.util.Scanner;
public class AgeAndHeight{
   public static void main(String[]args){

    //take age and height from the user
    Scanner sc=new Scanner(System.in);
    int amarAge=sc.nextInt();
    int akbarAge=sc.nextInt();
    int anthonyAge=sc.nextInt();
    double amarHeight=sc.nextDouble();
    double akbarHeight=sc.nextDouble();
    double anthonyHeight=sc.nextDouble();

    //find the youngest friend amoung them
    if(amarAge<=akbarAge && amarAge<=anthonyAge){
        System.out.println("Amar is the youngest");
    }
    else if(akbarAge<=amarAge && akbarAge<=anthonyAge){
        System.out.println("Akbar is the youngest");
    }
    else{
        System.out.println("Anthony is the youngest");
    }

    //find the tallest friend amoung them
    if(amarHeight>=akbarHeight && amarHeight>=anthonyHeight){
        System.out.println("Amar is the tallest"); 
    }
    else if(akbarHeight>=amarHeight && akbarHeight>=anthonyHeight){
        System.out.println("Akbar is the tallest");
    }
    else{
        System.out.println("Anthony is the tallest");
    }
   }
}
