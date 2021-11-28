//fibonacci eries rit
// 0       
// 1       1
// 2       3       5
// 8       13      21      34
// 55      89      144     233     377

import java.util.*;
public class pattern_12 {
    
    public static void pattern_01(int n){
        int nst=1,nsp=0,sum=0,a=0,b=1;

        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print(a+"\t");
                sum=a+b;
                a=b;
                b=sum;
            }
        
            
               nst= nst+1;
          
            
                System.out.println();
            }

        

        }
    

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int val=scn.nextInt();
        pattern_01(val);
        scn.close();
    }
}
