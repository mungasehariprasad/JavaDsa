package Recursion01;

import java.util.Scanner;

public class recursion_10 {
static int gcd(int x,int y){
    if (y==0){
        return x;
    }
    return gcd(y,x%y);
}
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
        System.out.println(gcd(24,15));
    }
}
