package Recursion01;
import java.util.Scanner;
public class recursion_2 {
    static void pd(int n){
        if (n==1){//Base case work
            System.out.println(1);
            return;
        }
        System.out.println(n);//self Work
        pd(n-1);//recursive Work
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        pd(4);
    }
}
