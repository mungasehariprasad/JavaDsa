package S6;
import java.util.*;
class emp{
    int empid;
    String empname;
    double salary;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the empid=");
        empid=sc.nextInt();
        System.out.println("Enter the empname=");
        empname=sc.next();
        System.out.println("Enter the salary=");
        salary=sc.nextDouble();
    }
    void set(){
        System.out.println("empid="+empid);
        System.out.println("empname="+empname);
        System.out.println("salary="+salary);
    }

}
public class Ampinfo {
    public static void main(String[] args) {
        emp a=new emp();
        a.get();
        a.set();
        emp a1=new emp();
        a1.get();
        a1.set();
        emp a2=new emp();
        a2.get();
        a2.set();
    }

}
