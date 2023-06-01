package Recursion02;
import java.util.Scanner;
public class L3BT {
    static void f(int i,int n){
        if (i<1){
            return;
        }
        f(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        f(n,n);
    }
}
