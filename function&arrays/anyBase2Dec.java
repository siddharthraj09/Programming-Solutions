import java.util.Scanner;
public class anyBase2Dec {
    
    //1 < b <= 10
    public static int anyBaseToDecimal(int n,int b){
        int res=0,pow=1;
        while(n!=0){
            int last_digit=n%10;
            res=res+last_digit*pow;
            pow=pow*b;
            n= n / 10 ;
        }
        return(res);
    }
   

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt(),base=scn.nextInt();
        int ans=anyBaseToDecimal(num, base);
        System.out.println(ans);
        scn.close();
    }
    

}
