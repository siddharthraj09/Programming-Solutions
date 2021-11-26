import java.util.*;
public class pythogoras {

    public static boolean triplet(int a,int b, int c){
          
        if( (a*a) == (b*b) + (c*c) ){
        return true;
        
        }else if( (b*b) == (a*a) + (c*c) ){
            return true;
        }
        else if( (c*c) == (a*a) + (b*b) ){
            return true;
        }
        else
        return false;
        
    }

public static void main(String[] args) {
  // write your code here  
   Scanner scn=new Scanner(System.in);
      int x=scn.nextInt(),y=scn.nextInt(),z=scn.nextInt();
      scn.close();
      boolean ans=triplet(x,y,z);
      if(ans){
          System.out.println("true");
      }
      else{
           System.out.println("false");

      }
 }
    
}
