
import java.util.*;
public class printArray {


    public static Scanner scn=new Scanner( System.in);
     public static void takeInput(int [] arr) {
         for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
         }
         
     }
     public static void print(int []arr,int l){
         if(l<0)
         return;
         print(arr, l-1);
         System.out.println(arr[l]);
     }

        public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        int l=arr.length-1;
        takeInput(arr);
        print(arr, l);
     }   
    
}
