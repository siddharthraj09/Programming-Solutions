// SPAN OF ARRAY

import java.util.Scanner;

public class spanOfArray {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            arr[i]=scn.nextInt();
        }

    }
   
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public static int arraySpan(int [] arr){

        int maxEl=Integer.MIN_VALUE;
        int minEl=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            maxEl=Math.max(maxEl,arr[i]);
            minEl=Math.min(minEl, arr[i]);
        }
        return(maxEl-minEl);

    }
    
    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        printArray(arr);
        int res=arraySpan(arr);
        System.out.println(res);
    }
    
}
