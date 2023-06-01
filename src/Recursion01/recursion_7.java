package Recursion01;
import java.util.Scanner;
public class recursion_7 {
    static int pow(int p,int q){
        if (q==0) return 1;
        return pow(p,q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}


