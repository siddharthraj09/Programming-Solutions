import java.util.Scanner;

public class spanOfArray {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            arr[i]=scn.nextInt();
        }

    }
   
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+"\t");
        }

    }
    
    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        printArray(arr);

    }
    
}
