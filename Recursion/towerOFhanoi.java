// 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
// 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
// 3. You are required to 
//     3.1. Print the instructions to move the disks.
//     3.2. from tower 1 to tower 2 using tower 3 
//     3.3. following the rules
//         3.3.1 move 1 disk at a time.
//         3.3.2 never place a smaller disk under a larger disk.
//         3.3.3 you can only move a disk at the top.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;

public class towerOFhanoi {
    public static Scanner scn=new Scanner(System.in);
    
    public static void TowerofHanoi(int n,int A,int B,int C) {
       if(n==0)
       return;
       TowerofHanoi(n-1, A, C, B);
        System.out.println(n+"["+A+" -> "+B+"]");
        TowerofHanoi(n-1, C, B, A);
    }
    
    
    public static void main(String[] args) {
     
        int n=scn.nextInt();
        int A=scn.nextInt();
        int B=scn.nextInt();
        int C=scn.nextInt();
        TowerofHanoi(n, A, B, C);
    }

}
