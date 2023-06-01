package Recursion02;
import static Recursion02.L13.helper;
public class L15 {
    static int cont(int n){
     return helper(n,0);
    }
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c+1);
        }
        return helper(n / 10, c);
    }
        public static void main (String[]args){
            System.out.println(cont(10002));

        }
    }
