package Recursion01;
import java.util.Scanner;
public class recursion_ex_1 {
     int sum(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }
//        sum(n-1);
//        System.out.println(n+(n-1));
//        int a=sum(n-1);
        int b=n+sum(n-1);
         System.out.println(b);
         return 0;


    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recursion_ex_1 v=new recursion_ex_1();
        v.sum(n);





    }
}
