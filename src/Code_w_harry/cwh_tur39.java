package Code_w_harry;
class empl{
    int salary=34444;
    String name="Hariprasad";

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void get(){
        System.out.println("name="+name);
        System.out.println("Salary="+salary);

    }

}
class cellphone{
    public void ringing(){
        System.out.println("ringing....");

    }
    public void vibrating(){
        System.out.println("vibrating....");
    }
}

public class cwh_tur39 {
    public static void main(String[] args) {
        empl e=new empl();
        e.get();
        cellphone c=new cellphone();
        c.ringing();
        c.vibrating();

    }
}
