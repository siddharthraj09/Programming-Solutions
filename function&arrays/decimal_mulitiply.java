//any base multiplacation
import java.util.Scanner;

public class decimal_mulitiply {
    

    public static int multiply_no(int n,int digit,int base){
        int ans=0,carry=0,pow=1;

        while(n!=0 || carry!=0){
         int prod=carry+(n%10)*digit;
         n=n/10;
         carry=prod / base; 
         prod=prod % base;
         ans=ans + prod*pow;

         pow=pow*10;
        }

        return ans;
    }
   
    public static int anyBaseAddition(int n,int m,int b){

        int ans=0,pow=1,carry=0;
        while(n!=0 || m!=0 || carry!=0){
        int sum=carry+(n%10)+(m%10);
        n=n/10;            
        m=m/10;

        carry=sum/10;
        sum=sum%10;
            
        ans=ans+sum*pow;
        pow=pow*10;
        }
        return(ans);

    }

    public static int getproduct(int n ,int m, int b){
        int ans=0,pow=1;
        while(m!=0){
            int digitmul=multiply_no(n, m%10, b);
            m=m/10;

            ans=anyBaseAddition(ans, digitmul*pow, b);
            pow=pow*10;
        }
        return(ans);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt(), m1=scn.nextInt(),b1=scn.nextInt();

        int res=getproduct(n1, m1, b1);
        System.out.println(res);
        scn.close();
    }






}
