package Recursion01;
import java.util.Scanner;
public class recursion_3 {
    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
        //        int s=fact(n-1);
//        int a=n*s;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        System.out.println(fact(3));
    }
}
