import java.util.Scanner;

public class RobotPathCheck {

    //check whether robot comes back to starting point
    static boolean isBackToOrigin(String path) {

        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++){
            char move = path.charAt(i);

            if(move == 'U')
                y++;
            else if(move == 'D')
                y--;
            else if(move == 'L')
                x--;
            else if(move == 'R')
                x++;
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String moves = sc.nextLine();

        System.out.println(isBackToOrigin(moves));
    }
}
