// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.

import java.util.*;
public class inverseArray {

     public static Scanner scn=new Scanner(System.in);

     public static void takeInput( int [] arr){

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
     }
     public static void printArray(int [] A) 
     {
         for (int i = 0; i < A.length; i++) {
             System.out.print(A[i]+"\t");
         }
         
     }

     public static void rotateArray(int [] arr){
        int [] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val=arr[i];
            ans[val]=i;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"\t");
        }
     }


     public static void main(String[] args) {
       int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        rotateArray(arr);
      //  printArray(res);
        
        
     }


    
}
