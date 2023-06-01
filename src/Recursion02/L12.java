package Recursion02;

public class L12 {
    static int sumofDigit(int n){
        if (n%10==n){
            return n;
        }
        return n%10*sumofDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumofDigit(12302));

    }
}
