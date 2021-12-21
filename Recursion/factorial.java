import java.util.*;

public class factorial {
    public static Scanner scn=new Scanner(System.in);

    public static int fact(int n) {
        // if(n==0)
        // return 1;
        // int ans=n*fact(n-1);
        // return ans;

        //OR above code can be wtirtten in short form

        return (n==0)?1:n*fact(n-1);

    }

    
    public static void main(String[] args) {
        int n=scn.nextInt();

        int res=fact(n);
        System.out.println(res);
    }
}
