import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static boolean[][] table;
    public static boolean winnerDeclared;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        winnerDeclared = false;
        System.out.println("how many players are there");
        int n = input.nextInt();
        table = new boolean[n][n];



        while(winnerDeclared == false){
            int random1 = (int) (Math.random() * n);
            int random2 = (int) (Math.random() * n);
            winnerDeclared = meet(random1, random2);
        }


    }
    public static boolean meet(int i, int j){

        //check for a winner
        int checkiWinner = 0;
        int checkjWinner = 0;
        for(int idx = 0; idx < i; idx++){
            if(table[idx][j] == true)
                checkjWinner++;
        }

        for(int idx = 0; idx < j; idx++){
            if(table[i][idx] == true)
                checkiWinner++;
        }

        if(checkjWinner == table.length && checkiWinner == table.length){
            System.out.println("i and j tie");
            return true;
        }else if(checkjWinner == table.length-1){
            System.out.println("player " + j + " wins");
            return true;
        }else if(checkiWinner == table.length-1){
            System.out.println("player " + i + " wins");
            return true;
        }

        if(table[i][j] == false){
            table[i][j] = true;
        }
        return false;
    }
}
