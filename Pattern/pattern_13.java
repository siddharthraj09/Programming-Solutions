// Sample Output                         nCr
// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1

import java.util.Scanner;
public class pattern_13 {

    public static void pattern(int num){
        
        for (int n=0;n<num;n++){
            int val=1;
            for(int r=0;r<=n;r++){
                 System.out.print(val+"\t");
                val=(((n-r)*val)/(r+1));
               
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        pattern(a);
        scn.close();
        //write your code here
    }
    
}
