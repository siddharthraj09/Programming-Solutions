// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

// shell-rotate
// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

import java.util.*;

public class ringRotate {

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

    public static int [] twoDTo1d(int [][] arr,int s) {
        int n=arr.length;
        int m=arr[0].length;
        int minr=s-1;
        int maxr=n-s;
        int minc=s-1;
        int maxc=m-s;
        int size=2*(maxr-minr + maxc-minc);
        int [] oneD=new int[size];
        int idx=0;

    for (int i = minr; i <= maxr; i++) {  
        oneD[idx]=arr[i][minc];
        idx++;
    } 

    minc++;
        
    for(int j = minc; j<= maxc; j++){
        oneD[idx] = arr[maxr][j];
        idx++;
    }
    
    maxr--;
    
    for(int i = maxr; i>=minr; i--){
        oneD[idx] = arr[i][maxc];
        idx++;
    }
    maxc--;
    
    for(int j = maxc; j>=minc; j--){
        oneD[idx] = arr[minr][j];
        idx++;
    }
    minr++;
    
    return (oneD);

    }

    public static void swap( int [] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int [] arr, int i, int j){
         while(i<=j){
        swap(arr,i,j);
        i++;   
        j--;
    }
    }
    public static void  rotate(int [] arr, int r){
        r%=arr.length;
        if(r<0){
            r = r + arr.length;
        }
        reverse(arr, 0, arr.length-r-1);
        reverse(arr, arr.length-r, arr.length-1);
        reverse(arr, 0 , arr.length-1);
        
    }
    
    
    public static void from1Dto2D(int [] oneD, int [][] arr, int s){
        int n = arr.length;         //rows
        int m = arr[0].length;      //col
        
        int minr = s-1; 
        int maxr = n-s;
        
        int minc = s-1;
        int maxc = m-s;
        
        
        
        
        int idx = 0;
        
        for(int i = minr; i<=maxr; i++){
            arr[i][minc] = oneD[idx];
            idx++;
        }
        minc++;
        
        for(int j = minc; j<= maxc; j++){
            arr[maxr][j]=oneD[idx];
            idx++;
        }
        
        maxr--;
        
        for(int i = maxr; i>=minr; i--){
            arr[i][maxc]=oneD[idx];
            idx++;
        }
        maxc--;
        
        for(int j = maxc; j>=minc; j--){
            arr[minr][j] = oneD[idx];
            idx++;
        }
        minr++;
        
    
    }

    public static void ring(int arr[][],int s,int r) {
        int [] oneD=twoDTo1d(arr, s);
        rotate(oneD, r);
        from1Dto2D(oneD, arr, s);

    }
    
    public static void main(String[] args) {
        int n=scn.nextInt();
        int m=scn.nextInt();       
        int [][] arr=new int[n][m];
        takeInput(arr);
        System.out.println("Enter set & rotation");
        int s=scn.nextInt();
        int r=scn.nextInt();
        ring(arr, s, r);
        printArray(arr);
        scn.close();

    }
}
