
// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".
import java.util.*;
public class StringCompression {
    public static Scanner scn=new Scanner(System.in);

    public static String compression2(String str){

        int n=str.length();
        int count=1;
        String ans=""+str.charAt(0);
        
        for (int i = 1; i < n; i++) {
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);
        
            if(cur==prev){
                count++;

            }
            else {
                if(count>1){
                ans=ans+count;
                count=1;
                }
                ans=ans+cur;
            }

        }
        if(count>1){
            ans=ans+count;
        }
        return(ans);

    }

    public static String compression1(String str) {

        int n=str.length();
        //int coun=0;
        String ans=""+str.charAt(0);
        
        for (int i = 1; i < n; i++) {
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);
        
            if(cur!=prev){
                 ans=ans+ cur;
            }    
        }
      return (ans);
    }



public static void main(String[] args) {

    String str=scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));

}
    
}
