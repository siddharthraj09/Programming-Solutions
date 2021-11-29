
import java.util.Scanner;

public class dec2bin {
   
    public static int decimaltobinary(int n){
        int res=0,pow=1;
        while(n!=0){
            int  digit=n%2;
            res=res+(digit*pow);
            pow=pow*10;
            n=n/2;
        }
        return(res);
    }

     public static int binarytodecimal(int x) {
         int res=0, pow=1;
        while(x!=0){

            int digit= x % 10;
            res=res+digit*pow;
            pow=pow*2;
             x= x / 10;
        }
        return(res);
    }
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int binary=decimaltobinary(num);
        System.out.println(binary);
        int decimal=binarytodecimal(binary);
        System.out.println(decimal);
    }


}
