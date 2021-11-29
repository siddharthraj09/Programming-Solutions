import java.util.Scanner;
public class dec2any_versa {

    //1 < b <= 10
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


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt(),base=scn.nextInt();
        int ans=dec_to_anybase(num, base);
        System.out.println(ans);
        scn.close();
    }
    
}
