// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.


import  java.io.*;
import java.util.*;

public class spiral {

    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    
    public static void spiral(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        
        //4 walls create
        
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        
        int count = 0;
        int total = n*m;
        
        while(count < total){
            //4 loop
            
            for(int i = minr ; i<=maxr && count < total ; i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            
            for(int j = minc; j<=maxc && count < total; j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            
            for(int i = maxr; i>=minr && count < total; i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            
            for(int j = maxc; j>=minc && count < total; j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
            
        }
    
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        input(arr);
        spiral(arr);
    }
}
