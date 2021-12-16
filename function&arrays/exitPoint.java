// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
import java.util.*;
public class exitPoint {

    public static  Scanner scn=new Scanner(System.in);

    public static void takeInput(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                 arr[i][j]=scn.nextInt();
            }
        }
      }

      public static void ExitPoint(int [][] arr) {
          int n =arr.length;
          int m=arr[0].length;
         int i=0,j=0;
            int dir=0;
         while(true){
            dir+=arr[i][j];
            dir=dir%4;

            if(dir==0){
                j++;
            }
            else if (dir==1){
                i++;

            }
            else if (dir==2){
                j--;
            }
            else{
                i--;
            }

            if(i<0 || j<0 || i>=n ||j>=m){
                break;
            }

         }

         if(i<0){
             i++;
         }
         else if(i>=n){
             i--;
         }
         else if (j<0){
             j++;
         }
         else if (j>=m){
             j--;
         }
         System.out.println(i);
         System.out.println(j);
          
      }

      public static void main(String[] args) {
          int n=scn.nextInt();
          int m=scn.nextInt();       
          int [][] arr=new int[n][m];
          takeInput(arr);
          ExitPoint(arr);


      }
    
}
