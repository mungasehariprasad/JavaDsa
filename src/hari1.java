import java.util.*;
class Emp
{
    int empid;
    String empname;
    float salary;
    void set(int a,String b,float c){
        empid=a;
        empname=b;
        salary=c;


    }
    void sets(int a,String b,float c){
        empid=a;
        empname=b;
        salary=c;
    }
    void setc(int a,String b,float c){
        empid=a;
        empname=b;
        salary=c;
    }
    void get(){
        System.out.println("empid="+empid);
        System.out.println("empname="+empname);
        System.out.println("salary="+salary);
    }
}
public class hari1 {
    public static void main(String[] args) {
        Emp a=new Emp();
//        Scanner set=new Scanner(System.in);


        a.set(100,"Hari",45552);
        a.get();
        a.sets(200,"Narayan",22222);
        a.get();
        a.setc(300,"Rushikesh",33333);
        a.get();



    }
}
