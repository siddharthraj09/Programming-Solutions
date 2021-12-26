import java.util.*;

public class stairPath {

    public static ArrayList <String> getStairpath(int n){
        if(n==0){
            ArrayList <String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList <String> myAns=new ArrayList<>();
        if(n-1>=0){
            ArrayList <String> nm1=getStairpath(n-1);
            for (String ele : nm1) {
                myAns.add("1"+ele);
            }
        }
        
        
        if(n-2>=0){
            ArrayList <String> nm2=getStairpath(n-2);
            for (String ele : nm2) {
                myAns.add("2"+ele);
            }
        }
        if(n-3>=0){
            ArrayList <String> nm3=getStairpath(n-2);
            for (String ele : nm3) {
                myAns.add("3"+ele);
            }
        }
        return myAns;

    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList <String> ans=getStairpath(n);
        System.out.println(ans);
    }

}
