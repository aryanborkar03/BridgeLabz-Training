import java.util.Scanner;
public class RockPaperScissors {

    //get computer choice
    public static String getComputerChoice(){
        int n = (int)(Math.random()*3);
        if(n==0) return "rock";
        if(n==1) return "paper";
        return "scissors";
    }

    //find winner of one game
    public static String findWinner(String user,String comp){
        if(user.equals(comp))
            return "Draw";

        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("rock") && comp.equals("paper")) return "Computer";

        if(user.equals("paper") && comp.equals("rock")) return "User";
        if(user.equals("paper") && comp.equals("scissors")) return "Computer";

        if(user.equals("scissors") && comp.equals("paper")) return "User";
        if(user.equals("scissors") && comp.equals("rock")) return "Computer";

        return "Invalid";
    }

    //calculate win stats
    public static String[][] calculateStats(int userWin,int compWin,int games){
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.valueOf((userWin*100)/games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.valueOf((compWin*100)/games);

        return stats;
    }

    //display results
    public static void display(String[][] games,String[][] stats){
        System.out.println("Game\tUser\tComputer\tResult");
        for(int i=0;i<games.length;i++){
            System.out.println(
                (i+1)+"\t"+
                games[i][0]+"\t"+
                games[i][1]+"\t\t"+
                games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tPercentage");
        for(int i=0;i<stats.length;i++){
            System.out.println(
                stats[i][0]+"\t"+
                stats[i][1]+"\t"+
                stats[i][2]+"%"
            );
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[][] results = new String[games][3];
        int userWin = 0, compWin = 0;

        for(int i=0;i<games;i++){
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = findWinner(user,comp);

            if(winner.equals("User")) userWin++;
            if(winner.equals("Computer")) compWin++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWin,compWin,games);
        display(results,stats);
    }
}
