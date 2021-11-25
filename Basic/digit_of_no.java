// Digits Of A Number

//input:65784383

//Sample Output
// 6
// 5
// 7
// 8
// 4
// 3
// 8
import java.util.*;
public class digit_of_no {
    public static int count_digit(int n){
      
        int count=0;
       
       while(n!=0){
           n=n/10;
           count++;
       }
       return(count);
   }
   public static void rev_dig(int num){
       
       int len=count_digit(num)-1;
       while(len>=0){
       int digit=num/(int)Math.pow(10,len);
       num=num%(int)Math.pow(10,len);
       System.out.println(digit);
       len--;
   }
       
   }
   
     
     public static void main(String[] args) {
       
       Scanner scn=new Scanner(System.in);
       int n =scn.nextInt();
       rev_dig(n);
       scn.close();
      }
}
