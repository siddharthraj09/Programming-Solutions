import java.util.*;

public class maxElementArray {
    public static Scanner scn=new Scanner(System.in);

     public static void takeInput(int [] arr) {
         for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
         }
        }

        public static int maxElemnet(int [] arr,int indx) {
            if(indx==arr.length-1){
                return arr[indx];
            }
            int recans=maxElemnet(arr, indx+1);
            int curr=arr[indx];
            if (curr>recans) {
                return curr; 
            }
            else{
                return recans;
            }
        }

    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int [n];
        takeInput(arr);
        int ans=maxElemnet(arr, 0);
        System.out.println(ans);
        scn.close();
    }
}
