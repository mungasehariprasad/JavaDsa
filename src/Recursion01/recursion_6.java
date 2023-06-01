package Recursion01;
import java.util.Scanner;
public class recursion_6 {
    static int sum(int n){
         if (n>=0&&n<=9) return 1;
         return sum(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
