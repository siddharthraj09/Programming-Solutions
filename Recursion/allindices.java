// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the all indices at which x occurs in array a.
// 5. Return an array of appropriate size which contains all indices at which x occurs in array a.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.*;

public class allindices {

    public static Scanner scn= new Scanner(System.in);

    public static void takeInput(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
           arr[i]=scn.nextInt();
        }
       }
       public static void printArray(int [] arr) {
           for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i]);
           }
           
       }

       public static int [] allIndices(int [] arr,int x,int idx,int count){
           if(idx==arr.length){
               int [] base=new int[count];
               return base;
           }
            if(arr[idx]==x){
                count++;
            }
            int [] recAns=allIndices(arr, x, idx+1, count);
            if(arr[idx]==x){
                recAns[count-1]=idx;
            }
            return recAns;
       }

       public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int [n];
        takeInput(arr);
        int x =scn.nextInt();
       int [] ans= allIndices(arr,x,0,0);
       if(arr.length == 0){
        System.out.println();
        return;
    }
       printArray(ans);
       

       }

    
}
