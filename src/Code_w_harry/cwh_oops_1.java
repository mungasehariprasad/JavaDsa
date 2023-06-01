package Code_w_harry;
class Emp{
    int id=23;
    String name="HARI";
    Float salary;
    double pre;
    boolean tr=true;


    public void print(){
        System.out.println("MY Id="+id);
        System.out.println("MY name="+name);
    }
    public void print_main(Float salary,double pre){
        this.salary=salary;
        this.pre=pre;
        System.out.println("MY Salary="+salary);
        System.out.println("MY pre="+pre);
    }
    public void print_mani_2(){
        System.out.println("class is true and false="+tr);
    }

}
public class cwh_oops_1 {
    public static void main(String[] args) {
        Emp e=new Emp(); //Instantiation a new Emp Object
       e.print();
       e.print_main(344.44f,78.5);
       e.print_mani_2();

    }
}
