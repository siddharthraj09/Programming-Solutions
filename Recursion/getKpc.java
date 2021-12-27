// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.*;
public class getKpc {


    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(getKPC(s));
        
    }

    public static ArrayList<String> getKPC(String str) {
       if(str.length() == 0){
           ArrayList<String> base = new ArrayList<>();
           base.add("");
           return base;
       }
       
       char ch = str.charAt(0);
       String ros = str.substring(1);
       
       ArrayList<String> recAns = getKPC(ros);
       ArrayList<String> myAns = new ArrayList<>();
       
       int idx = ch-'0';
       
       String code = codes[idx];
       
       
       
       for(int i = 0; i<code.length(); i++){
           char newChar = code.charAt(i);
           for(String ele : recAns){
               myAns.add(newChar + ele);
           }
           
       }
       
       return myAns;
       
       
       
       
       
    }
    
}
