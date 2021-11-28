// Sample Output
// 		    1	
// 	     2	3	2	
//   3	 4	5	4	3	
// 	     2	3	2	
// 		    1	

import java.util.Scanner;

public class pattern_15 {
    
    public static void pattern(int n){

        int nst=1,nsp=n/2;
        for(int r=1;r<=n;r++){
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("\t");
        }

        int count=(r<=n/2)?r:n-r+1;

        for(int cst=1;cst<=nst;cst++){
            
            System.out.print(count+"\t");
            
            count=(cst<=nst/2)?count+1:count-1;
        } 

        if(r<=n/2){
            nst=nst+2;
            nsp--;
        }
        else{
            nst-=2;
            nsp++;
        }
        System.out.println();
    }

    
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        pattern(x);
        scn.close();

    }
}
