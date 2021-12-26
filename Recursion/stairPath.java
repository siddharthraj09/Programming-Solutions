// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;

public class stairPath {

    public static ArrayList <String> getStairpath(int n){
        if(n==0){
            ArrayList <String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList <String> myAns=new ArrayList<>();
        if(n-1>=0){
            ArrayList <String> nm1=getStairpath(n-1);
            for (String ele : nm1) {
                myAns.add("1"+ele);
            }
        }
        
        
        if(n-2>=0){
            ArrayList <String> nm2=getStairpath(n-2);
            for (String ele : nm2) {
                myAns.add("2"+ele);
            }
        }
        if(n-3>=0){
            ArrayList <String> nm3=getStairpath(n-2);
            for (String ele : nm3) {
                myAns.add("3"+ele);
            }
        }
        return myAns;

    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList <String> ans=getStairpath(n);
        System.out.println(ans);
    }

}
