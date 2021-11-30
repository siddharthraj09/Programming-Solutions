
//anybase addition
import java.util.Scanner;

public class anyBaseAddition{


   public static int anyBaseADD(int n1,int n2,int b) {
    int res=0,pow=1,carry=0;
    while(n1!=0 || n2!=0 || carry!=0){
        int sum=carry+ (n1%10) +(n2%10);
        n1/=10;
        n2/=10;

        carry=sum/b;
        sum=sum%b;

        res=res+ sum*pow;
         
        pow=pow*10;
    }
    return(res);
   }


   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int num1=scn.nextInt(),num2=scn.nextInt(),base=scn.nextInt();   
    int ans=anyBaseADD(num1, num2, base);
    System.out.println(ans);
    scn.close();
   }


}