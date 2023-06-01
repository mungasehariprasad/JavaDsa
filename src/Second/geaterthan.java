package Second;
import java.util.*;
class greater{
    int n1,n2;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fist num");
        n1= sc.nextInt();
        System.out.println("Enter the second num");
        n2= sc.nextInt();

    }
    void great(){
        if (n1>n2){
            System.out.println("n1 is greater than n2");
        }
        else {
            System.out.println("n2 is greter then n1");
        }
    }

}


public class geaterthan {
    public static void main(String[] args) {
        greater a=new greater();
        a.get();
        a.great();
    }

}
