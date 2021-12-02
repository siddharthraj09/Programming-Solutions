// start bar chart
// *
// *                       *
// *                       *
// *       *               *
// *       *               *
// *       *       *       *

import java.util.*;

public class BarChar{

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();           
        }

    }

    
    
    public static void printArray(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }



    public static int maxElement(int [] arr){
        int maxEle=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){
            maxEle=Math.max(maxEle, arr[i]);
        }
        System.out.println("max Element="+maxEle);
       return(maxEle);
    }



    public static void barChart(int [] arr){
        int maximumElement=maxElement(arr);
        int height=maximumElement;
        for (int i = 0; i < maximumElement; i++) {
            for(int j=0;j < arr.length; j++){

                if(arr[j]>=height){
                    System.out.print("* \t");
                }
                else{
                    System.out.print("\t");
                }
            }
            height--;
            System.out.println();
        }       
    }


    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        printArray(arr);
        barChart(arr);
        scn.close();
    }

}
