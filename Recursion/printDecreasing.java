// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 & from 1 to n
// 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.Scanner;

public class printDecreasing {

    public static Scanner scn=new Scanner(System.in);
    public static void printDecr(int n) {
        if (n==0)
        return;

        System.out.println(n);
        printDecr(n-1);
    }
    
    public static void printInrease(int n) {
        
        if (n==0)
        return;
        printInrease(n-1);
        System.out.println(n);
    }




    public static void main(String[] args) {
        int n=scn.nextInt();
        printDecr(n);
        System.out.println("Increasing" );
        printInrease(n);
    }
    
}
