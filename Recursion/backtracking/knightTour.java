// 1. You are given a number n, the size of a chess board.
// 2. You are given a row and a column, as a starting point for a knight piece.
// 3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
//      all cells of the board exactly once.
// 4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
//      print all configurations of the chess board representing the route
//      of knight through the chess board. Use sample input and output to get more idea.

// Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
//                move in clockwise manner to
//                explore other options.
// Note -> The online judge can't force you to write the function recursively but that is what the spirit of 
//                question is. Write recursive and not iterative logic. The purpose of the question is to aid 
//                learning recursion and not test you.

package backtracking;
import java.util.*;
public class knightTour {
        
    static int [][] dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}};
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        
        //starting pos
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        //bahar chala gya hai kya?
        if(r >= chess.length || r < 0 || c < 0 || c >= chess[0].length || chess[r][c] != 0 ){
            return;
        }
        //answer mil gya hai?
        if(upcomingMove == chess.length * chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        //mark
        chess[r][c] = upcomingMove;
        
        // calls
        for(int d = 0 ; d<dir.length; d++){
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightsTour(chess, x, y, upcomingMove+1);
        }
        
        chess[r][c] = 0;
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
