import java.util.Scanner;


public class anyBase2anyBase {

    public static int dec_to_anybase(int n,int b){
        int res=0,pow=1;
        while(n!=0){
            int last_digit=n%b;
            res=res+last_digit*pow;
            pow=pow*10;
            n= n / b ;
        }
        return(res);
    }
    
    

    public static int anyBaseToDecimal(int n,int abase,int rbase){
        int res=0,pow=1;
        while(n!=0){
            int last_digit=n%10;
            res=res+last_digit*pow;
            pow=pow*abase;
            n= n / 10 ;
        }
        int ans=dec_to_anybase(res,rbase);
        return(ans);
        
    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt(),abase=scn.nextInt(),rbase=scn.nextInt();
        int ans=anyBaseToDecimal(num, abase,rbase);
        System.out.println(ans);
        scn.close();
    }
    
}
