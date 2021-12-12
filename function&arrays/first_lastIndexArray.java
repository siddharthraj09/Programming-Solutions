//to find first and last index in an array
import java.util.Scanner;
public class first_lastIndexArray {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){

        for ( int i = 0; i < arr.length; i++) {

            arr[i]=scn.nextInt();
        }
    }
    public static int firstINDEX(int [] arr,int x){
        int li=0,ri=arr.length-1;
        int fi=-1;
        while(li<=ri){

            int mid=(li+ri)/2;
            if(arr[mid]==x){
                fi=mid;
                ri=mid-1;
            }
            else if( arr[mid]>x){
                ri=mid-1;
            }
            else if(arr[mid]<x){
                li=mid +1;
            }

        }
        return fi;
        }
        public static int lastINDEX(int [] arr,int x){
            int li=0,ri=arr.length-1;
            int last_index=-1;
            while(li<=ri){
    
                int mid=(li+ri)/2;
                if(arr[mid]==x){
                    last_index=mid;
                    li=mid+1;
                }
                else if( arr[mid]>x){
                    ri=mid-1;
                }
                else if(arr[mid]<x){
                    li=mid +1;
                }
    
            }
         return last_index;
            }
    
        public static void main(String[] args) {
            int n=scn.nextInt();
            int [] arr=new int[n];
            takeInput(arr);
            System.out.println("Enter Number to find");
            int x=scn.nextInt();
            int first=firstINDEX(arr, x);
            System.out.println(first);
            int last=lastINDEX(arr, x);
            System.out.println(last);
        }
}
