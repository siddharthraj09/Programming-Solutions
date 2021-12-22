// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;

public class linearPower {
    public static Scanner scn=new Scanner(System.in);

    public static int power(int x, int n) {
        // if(n==0)
        // return 1;
        //int ans=x*power(x,n-1);
        //return ans;

        //abobe alternative

        return (n==0)?1:x*power(x, n-1);
        
    }
    //It is more efficent than linear method 
    public static int logPower(int x,int n) {
        if (n==0)
        return 1;
        int recans=logPower(x, n/2);
        int ans=recans*recans;
        if(n%2!=0){
             ans=ans*x;
        }
        return ans;
    }



    public static void main(String[] args) {
        int x=scn.nextInt();
        int n=scn.nextInt();
         int ans=power(x, n);
       int ans1 =logPower(x, n);
       System.out.println("by linear:");
       System.out.println(ans);
       System.out.println("by log");
        System.out.println(ans1);
    }
    
}
