// 1. You are required to display the prime factorization of a number.
//     2. Take as input a number n.
//     3. Print all its prime factors from smallest to largest.
                               

import java.util.Scanner;

public class prime_factorization {

    public static void factor(int num){
        int x=num;
        for(int i=2;i*i<=x;i++){
              while(num % i ==0){
                  System.out.print(i + " ");
                  num=num/i;
              }

        }
        if(num!=1)
        System.out.print(num);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        factor(n);
        scn.close();
    }
    
}
