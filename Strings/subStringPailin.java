
// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.
// Input Format
// A String
// Output Format
// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
import java.util.*; 

public class subStringPailin {

    public static Scanner scn=new Scanner(System.in);
    
    public static boolean isPalindrome( String str1) {
        int i=0,j =str1.length()-1;
        while(i<=j){
            if(str1.charAt(i)!=str1.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
        
    }
    public static void Print_subs(String s){
        int n = s.length();
		for(int st = 0; st<n; st++){
        for(int end = st; end<n; end++ ){
            
            String subS = s.substring(st, end+1);
            if(isPalindrome(subS) == true)
                System.out.println(subS);         
        }
       
    }


    }


    public static void main(String[] args) {
        String str=scn.next();
        Print_subs(str);
        scn.close();


    }
}
