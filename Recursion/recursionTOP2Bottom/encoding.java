package recursionTOP2Bottom;

// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you
import java.util.*;
public class encoding {
    public static Scanner scn=new Scanner(System.in);

        public static void main(String[] args) {
            String str=scn.next();
            printEncodings(str, "");

        }

    public static void printEncodings(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        if(str.charAt(0) == '0'){
            return;
        }
        
        char ch1 = str.charAt(0);       //'6'
        int v1 = ch1 - '0';             // 6 -> int
        
        
        printEncodings(str.substring(1), ans + (char)(v1 + 'a' - 1));
        
        if(str.length() > 1){
            char ch2 = str.charAt(1);
            int v2 = ch2 - '0';
            
            int num = v1 * 10 + v2;
            if(num <= 26){
                printEncodings(str.substring(2), ans + (char)(num + 'a' - 1) );
            }
        }
        
        
        
    }


    
}
