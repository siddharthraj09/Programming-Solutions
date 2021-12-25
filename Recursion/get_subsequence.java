// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.*;

public class get_subsequence {

    public static Scanner scn=new Scanner(System.in);

    public static ArrayList <String> gss( String str){
        if(str.length()==0){
            ArrayList <String> base=new ArrayList<>();
            base.add(" ");
            return base;
        }

        char ch=str.charAt(0);
        String  res=str.substring(1);
        ArrayList<String> recAns =gss(res);
        ArrayList<String> myAns=new ArrayList<>();
        for (String ele : recAns) {
            myAns.add(ele);
        }
        for (String ele : recAns) {
            myAns.add(ch+ele);
        }
        return myAns;
    }

    public static void main(String[] args) {
        String s = scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }


}
