// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15

import java.util.*;

public class pattern_11 {
   
    
    public static void pattern_01(int n){
        int nst=1,nsp=0,count=1;

        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print(count+"\t");
                count++;
            }
            for( int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
               nst= nst+1;
              nsp=nsp+0;
            
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
