// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*

import java.util.*;
public class rotateBy90Matrix {
    
    public static  Scanner scn=new Scanner(System.in);

    public static void takeInput(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                 arr[i][j]=scn.nextInt();
            }
        }
      }
      
    public static void printArray(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

      public static void rotateBY90 (int [][]arr ){
        int n=arr.length;
         for (int i = 0; i < n; i++) {
             for (int j = i; j < n; j++) {
                 int temp=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
             }   
         }

         for (int i = 0; i < arr.length; i++) {
             int li=0;
             int ri=n-1;

             while(li<=ri){
                int alt=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=alt;

                li++;
                ri--;
             }
         }
      }

      


      public static void main(String[] args) {
        int n=scn.nextInt();
        int m=scn.nextInt();       
        int [][] arr=new int[n][m];
        takeInput(arr);
        rotateBY90(arr);
        printArray(arr);

      }
}
