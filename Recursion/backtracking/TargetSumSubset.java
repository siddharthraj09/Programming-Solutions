// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

package backtracking;
import java.util.*;
public class TargetSumSubset {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr, 0,"", 0, tar);
        
    }
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if(sum > tar){
            return;
        }
        if(idx == arr.length){
            if(tar == sum){
                System.out.println(asf + ".");
            }
            return;
        }
        //pick done
        printTargetSumSubsets(arr, idx+1, asf + arr[idx] + ", ", sum + arr[idx] , tar);
        
        //not picked
        printTargetSumSubsets(arr, idx+1, asf, sum, tar);
    }


}
