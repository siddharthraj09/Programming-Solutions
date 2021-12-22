// 1. Here are a few sets of inputs and outputs for your reference
// Input1 -> 1
// Output1 -> 1 1 1

// Input2 -> 2
// Output2 -> 2 1 1 1 2 1 1 1 2

// Input2 -> 3
// Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

// 2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and n

import java.util.*;
public class printZigzag {
  
    public static Scanner scn= new Scanner(System.in);

     public static void PrintZig(int n) {
        if (n==0)
        return ;
        System.out.print(n+" ");
        PrintZig(n-1);
        System.out.print(n+" ");
        PrintZig(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
    int n =scn.nextInt();
        PrintZig(n);

    }
}
