package Recursion02;

import java.util.Scanner;
public class L4 {
    static void f(int i,int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        f(n,0);
    }
}
