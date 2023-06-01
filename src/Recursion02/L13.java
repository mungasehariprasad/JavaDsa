package Recursion02;
import java.util.Scanner;
public class L13 {
    static int rev1(int n){
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    }
    static int helper(int n, int digit) {
        if (n%10==0){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }
    static boolean palin(int n){
        return n==rev1(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palin(n));
    }
}
