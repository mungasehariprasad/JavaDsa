package Recursion02;

import java.util.Scanner;

public class L2 {
    static void pi(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        pi(i+1,n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pi(1,n);
    }
}
