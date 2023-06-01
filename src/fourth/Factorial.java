package fourth;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        n=sc.nextInt();

        while (n>0){
            fact=fact*n;
            n--;
        }
        System.out.println("factorial of no="+fact);
    }

}
