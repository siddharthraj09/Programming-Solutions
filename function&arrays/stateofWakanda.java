
// For example, the monuments are named as follows:
// 1  2  3
// 4  5  6
// 7  8  9

// Path followed by traveler: 1->4->7->8->5->2->3->6->9

// You are required to print the path that this traveler follows to visit all places.


import java.util.*;
public class stateofWakanda {
    public static  Scanner scn=new Scanner(System.in);

    public static void takeInput(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                 arr[i][j]=scn.nextInt();
            }
        }
      }
        public static void state_of_wakanda(int [][] arr) {
            for (int j = 0; j < arr.length; j++) {
                if(j % 2 == 0){
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i][j]+"-->");
                    }
                }
                else{
                    for (int i = arr.length-1;i >=0; i--) {
                        System.out.print(arr[i][j]+"-->");
                    }
                }
                
            }
            
        }

    public static void main(String[] args) {
        int n1= scn.nextInt();
        int m1=scn.nextInt();
        int [] [] A=new int [n1][m1];
        takeInput(A);
        state_of_wakanda(A);
    
     }
 }
