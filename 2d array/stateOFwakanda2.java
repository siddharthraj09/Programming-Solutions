import java.util.*;
public class stateOFwakanda2 {

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

    public static void SOW2(int [][] arr){
        for(int gap =0; gap <arr.length; gap++){
            for (int i = 0,j=gap; j < arr.length; i++,j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        int n=scn.nextInt();
        int [][] arr=new int[n][n];
        takeInput(arr);
        printArray(arr);
        SOW2(arr);
    }
    
}
