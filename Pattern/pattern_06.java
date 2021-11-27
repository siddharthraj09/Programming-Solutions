// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	

import java.util.*;
public class pattern_06 {

    public static void pattern_01(int n){
        int nst=(n/2)+1,nsp=1;

        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            for( int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            if(r<=n/2){
        nst--;
         nsp=nsp+2;
            }
            else{
                nsp=nsp-2;
               nst++;

            }

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
