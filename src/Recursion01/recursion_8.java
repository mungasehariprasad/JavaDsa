package Recursion01;

public class recursion_8 {
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if (n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }   static void funBoth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        funrev(5);



    }
}
