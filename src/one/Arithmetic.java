package one;
import java.util.*;
class Arith{

    int a,b,sum;
    void get(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the a num");
        a=s.nextInt();
        System.out.println("Enter the b num");
        b=s.nextInt();
    }
    void Add(){
        sum=a+b;
        System.out.println("sum="+sum);
    }

    void sub(){
        sum=a-b;
        System.out.println("sub="+sum);
    }
    void mul(){
        sum=a*b;
        System.out.println("mul="+sum);
    }
    void div(){
        sum=a/b;
        System.out.println("div="+sum);
    }


}
public class Arithmetic {
    public static void main(String[] args) {
        Arith a1=new Arith();
        a1.get();
        a1.Add();

        Arith a2=new Arith();
        a2.get();
       a2.sub();

       Arith a3=new Arith();
        a3.get();
       a3.div();

       Arith a4=new Arith();
        a4.get();
       a4.mul();





    }


}
