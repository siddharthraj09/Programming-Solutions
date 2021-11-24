// WAP to find numbers between a range

import java.util.*;

public class range_prime {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return (false);
            }

        }
        return (true);
    }

    public static void range(int lo, int hi) {
        for (int z = lo; z <= hi; z++) {
            if (isPrime(z)) {
                System.out.println(z);
            }
        }

    }

    public static void main(String[] args) {
        // Scanner scn=new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();
        range(a, b);
        scn.close();
    }
}