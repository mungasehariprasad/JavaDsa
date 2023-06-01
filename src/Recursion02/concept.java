package Recursion02;

public class concept {
    static void fun(int n){
        if (n==0){
            return;
        }

        fun(--n);
        System.out.println(n);

    }
    public static void main(String[] args) {
        fun(5);
    }
}
