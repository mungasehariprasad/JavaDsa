package Recursion03;
import java.util.Scanner;
public class power_sqr {
    static int pow(int p, int q) {
        if (q == 0) return 1;
        return p * pow(p, q - 1);
    }

    static int power(int p, int q) {
        if (q == 0) return 1;
        if (q % 2 == 0) {
            int smallpow = power(p, q / 2);
            return smallpow * smallpow;
        }
        if (q % 2 == 1) {
            int smallpow = power(p, q / 2);
            return p * smallpow * smallpow;
        }
        return power(p, q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p, q));
//        System.out.println(pow(p,q));
//        System.out.println(pow(2,2));
    }
}
