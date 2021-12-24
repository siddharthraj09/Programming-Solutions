// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.
// 5. If x exists in array, print the first index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;
public class firstIndex {
    public static Scanner scn= new Scanner(System.in);

    public static void takeInput(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
           arr[i]=scn.nextInt();
        }
       }

       //first index
       public static int firstele(int [] arr,int indx,int x){
        if(indx==arr.length ){
            return -1;
        }
        if(arr[indx]==x){
            return indx;
        }
      return(firstele(arr, indx+1, x));
    }


       public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int [n];
        takeInput(arr);
       // System.out.println("element to find");
        int x=scn.nextInt();
       int ans=firstele(arr,0, x);
     //  System.out.println("first index");
        System.out.println(ans);
      
        scn.close();
    }

    
}
