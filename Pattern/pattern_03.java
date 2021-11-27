// 				    *	
// 			   *	*	
// 		   *	*	*	
// 	   *	*	*	*	
// *	*	*	*	*	
import java.util.Scanner;

public class pattern_03 {
    

    public static void pattern_01(int n){
        int nst=1,nsp=n-1;

        for(int r=1;r<=n;r++){
            for( int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
     
        
        nst++;
        nsp--;
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
