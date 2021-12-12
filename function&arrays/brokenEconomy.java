//Broken economy
import java.util.Scanner;
public class brokenEconomy {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){

        for ( int i = 0; i < arr.length; i++) {

            arr[i]=scn.nextInt();
        }
    }

    public static int binSearch(int [] arr,int x){
        	int floor=0,ceil=0;
        int li=0,ri=arr.length-1;

        while(li<=ri){

            int mid=(li+ri)/2;
            if(arr[mid]==x){
              return mid;
            }
            else if( arr[mid]>x){
                ri=mid-1;
                ceil=arr[mid];
            }
            else if(arr[mid]<x){
                li=mid +1;
                floor=arr[mid];
            }

        }
        System.out.println(floor);
        System.out.println(ceil);
        return -1;
        }

        public static void main(String[] args) {
            int n=scn.nextInt();
            int [] arr=new int[n];
            takeInput(arr);
            System.out.println("Enter Number to find");
            int x=scn.nextInt();
           int res= binSearch(arr, x);
        // //    System.out.println(res);
        //    if(res==-1){
        //        System.out.println("Not found");
        //    }
        //    else{
        //        System.out.println(res);
        //    }
        }
    
}
