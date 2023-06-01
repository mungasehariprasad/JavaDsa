package Recursion01;
import java.util.Scanner;
public class Recursion_1 {
    static void pi(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        pi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        pi(5);
    }
}
