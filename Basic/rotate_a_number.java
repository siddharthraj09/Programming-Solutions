//ROATATE A NUMBER

// . You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340


import java.util.*;

public class rotate_a_number {
    
    public static  int count_digit(int num){
            int count=0;

        while(num!=0){
            num=num/10;
            count++;
        }
        return (count);
    }

    public static int rotate(int n,int r){

        int len=count_digit(n);

        r= (r % len+ len)%len;

        int div=1,mul=1;
        for(int i=1;i<=len;i++){
            if(i<=r){
                div=div*10;
            }
            else
            mul=mul*10;

        }
        int a=n/div;
        int b=n%div;

        return (b*mul+a);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int no=scn.nextInt();
        int ro=scn.nextInt();
        scn.close();
        int ans=rotate(no, ro);
    System.out.println(ans);
    }
}
