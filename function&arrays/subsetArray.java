import java.util.*;

public class subsetArray{


    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){

        for ( int i = 0; i < arr.length; i++) {

            arr[i]=scn.nextInt();
        }
    }
    
    public static void subsetArr(int [] arr) {

        int n=arr.length;
        int total=(int) Math.pow(2, n);

        for (int i = 0; i < total; i++) {
            String str = "";
            int temp=i;
            for (int j = n-1; j >= 0; j--) {
                int r=temp%2;
                temp=temp/2;

                if(r==0){
                    str="-\t"+str;
                }
                else{
                    str=arr[j]+"\t"+str;
                }
                
            }
            
            System.out.println(str);
        }
        
    }

    public static void main(String[] args) {
        int n=scn.nextInt();
        int [] arr=new int[n];
        takeInput(arr);
        subsetArr(arr);
        scn.close();
    }

}