package Recursion02;

import java.util.Scanner;

public class L3 {
    static void pd(int i,int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        pd(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       pd(n,n);
    }
}
