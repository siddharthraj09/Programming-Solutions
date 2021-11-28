//   *			 *	
//  	*	  *		
//	       *			
//  	*	  *		
//   *			  *	


import java.util.*;

public class pattern_09 {
    
    
    public static void pattern_01(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r+c==n+1 || r==c ){
                    System.out.print("*\t"); 
                }
                else{
                    System.out.print("\t"); 
                }
               
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
