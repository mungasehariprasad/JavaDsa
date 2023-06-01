package Recursion03;
import java.util.Scanner;
public class multip {
    static void multiples(int n,int k){
        if (k==0) return;
        multiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        multiples(n,k);
    }
}
