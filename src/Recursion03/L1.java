package Recursion03;
import java.util.Scanner;
public class L1 {
    static void f(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        f(n+1);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        f(1);
    }
}
