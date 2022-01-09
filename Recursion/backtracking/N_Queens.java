// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
package backtracking;
import java.util.*;
public class N_Queens{

    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        printNQueens(chess, "", 0);
        
    }
    public static boolean isSafe(int r, int c, int [][] chess){
        int n = chess.length;
        //1. 
        for(int i = r-1, j = c + 1; i >= 0 && j < n; i--, j++ )
        {
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        //2.
        for(int i = r-1, j = c; i >= 0 ; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        //3. 
        for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        return true;
    }
    public static void printNQueens(int[][] chess, String asf, int row) {
        if(row == chess.length){
            System.out.println(asf+".");
            return;
        }
        
        for(int col = 0; col<chess.length; col++){
            if(isSafe(row,col,chess)){
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

}