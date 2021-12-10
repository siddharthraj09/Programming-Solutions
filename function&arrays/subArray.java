import java.util.*;

public class subArray {

    
    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){

        for ( int i = 0; i < arr.length; i++) {

            arr[i]=scn.nextInt();
        }
    }
    
    public static void sub_Array(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+"\t");
                }
                System.out.println();
            }
        }
        
    }
        
    

    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        sub_Array(arr);
    }
}
