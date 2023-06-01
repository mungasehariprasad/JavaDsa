package Amp;
public class Ampel{
    String name;
    int id;
    double salary;
    public void A(){
        System.out.println("This is name=");
        System.out.println("This is id= ");
        System.out.println("This salary=");
    }
    public Ampel(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void get(){
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("salary="+salary);
    }


}



