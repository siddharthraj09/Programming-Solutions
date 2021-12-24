// . You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.Scanner;

public class lastIndex {

    public static Scanner scn= new Scanner(System.in);

    public static void takeInput(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
           arr[i]=scn.nextInt();
        }
       }
       public static int lastindex(int [] arr,int idx,int x){
       if(idx==arr.length){
           return -1;
       }

       int li =lastindex(arr, idx+1, x);
       if(li == -1 ){

        if(arr[idx]==x){
            return idx;
        }
        else{
            return li;
        }
    }
        else{
            return li;
        }

       }
    

       public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int [n];
        takeInput(arr);
        int x =scn.nextInt();
        int ans=lastindex(arr,0,x);
        System.out.println(ans);
       }

    
}
