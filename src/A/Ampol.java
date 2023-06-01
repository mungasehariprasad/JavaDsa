package A;

public class Ampol {
    int id;
    String name;
    double salary;
    public Ampol(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public void display(){
        System.out.println("This is a id="+id);
        System.out.println("This is a name="+name);
        System.out.println("this is a salary="+salary);
    }


}
