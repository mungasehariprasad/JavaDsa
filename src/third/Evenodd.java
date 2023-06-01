package third;
import java.util.*;
class EO{
    int n;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        n=sc.nextInt();

    }
    void evenodd(){
        if (n%2==0){
            System.out.println("num is even");
        }
        else {
            System.out.println("num  is odd");
        }

    }
}

public class Evenodd {
    public static void main(String[] args) {
        EO a=new EO();
        a.get();
        a.evenodd();
    }
}
