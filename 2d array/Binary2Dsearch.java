import java.util.*;

public class Binary2Dsearch{

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

    public static void binary2Dsearch(int [][]arr,int x) {

        int n =arr.length;
        int m=arr[0].length;
        int i =0;
        int j=m-1;
        while( j>=0 && i <= n-1 ){
            int element = arr[i][j];
            
            if(element == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if( element > x){
                j--;
            }
            else{
                i++;
            }
        }
        
        System.out.println("Not Found");


    }


    public static void main(String[] args) {
        int n=scn.nextInt();
        int m=scn.nextInt();       
        int [][] arr=new int[n][m];
        takeInput(arr);
        int x =scn.nextInt();
        binary2Dsearch(arr, x);
    }

}