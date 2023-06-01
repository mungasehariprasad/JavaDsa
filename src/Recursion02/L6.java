
package Recursion02;
import java.util.Scanner;
public class L6 {
    static int f(int n){
        if (n==0){
            return 1;
        }
        return n*f(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
    }
}
