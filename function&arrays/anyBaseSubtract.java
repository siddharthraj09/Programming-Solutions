import java.util.Scanner;

public class anyBaseSubtract {

    public static int anyBaseSUB(int n1,int n2,int b) {
        int res=0,pow=1,borr=0;
        while(n1!=0 || n2!=0 || borr!=0){
            int sub=borr+ (n1%10) - (n2%10);
            n1/=10;
            n2/=10;
            if(sub<0){
                sub=sub+b;
                borr=-1;
            }
            else 
            borr=0;

            res=res+ sub*pow;
             
            pow=pow*10;
        }
        return(res);
       }
    
    
       public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // N1>N2
        int num1=scn.nextInt(),num2=scn.nextInt(),base=scn.nextInt();   
        int ans=anyBaseSUB(num1, num2, base);
        System.out.println(ans);
        scn.close();
       }
    
    
}
