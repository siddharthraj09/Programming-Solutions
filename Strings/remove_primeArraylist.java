// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

import java.util.*;
public class remove_primeArraylist {

    public static Scanner scn=new Scanner(System.in);
    public static void takeInput(ArrayList <Integer> al,int n){
        for (int i = 0; i <n; i++) {
            al.add(scn.nextInt());
        }
    }

    public static boolean isPrime(int n){
       
        for (int i = 2; i *i<= n; i++) {
            if(n%i==0){
                return false;
            }
            
        }
        return true;

    }

    public static void removePrime(ArrayList <Integer> al){

        int n =al.size();
        for (int i = n-1; i >=0; i--) {
            
            if (isPrime(al.get(i))){
                al.remove(i);

            }
        }
        System.out.println(al);

    }
    


public static void main(String[] args) {
    int n=scn.nextInt();
    ArrayList <Integer> al=new ArrayList<>();
    takeInput(al, n);
    removePrime(al);

}
}