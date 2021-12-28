// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;
public class mazePath {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        ArrayList<String> ans = getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        
        if(sc + 1 <= dc){
            ArrayList<String> hCall = getMazePaths(sr, sc + 1, dr, dc );
            for(String ele : hCall ){
                myAns.add("h" + ele);
            }
        }
        
        if(sr + 1 <= dr){
            ArrayList<String> vCall = getMazePaths(sr + 1, sc, dr, dc );
            for(String ele : vCall ){
                myAns.add("v" + ele);
            }
        }
        
        
        
        return myAns;
        
        
    }
    
}
