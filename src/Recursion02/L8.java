package Recursion02;
import java.util.Scanner;
public class L8 {
    static int f(int n){
        if (n==0||n==1) return n;
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(f(n));
        System.out.println(f(3));
    }
}
