package S7;



class Stu{
    int id=104;
    String name="Hariprasad";
    static String collegename="BIT Barshi";

    void set(){
        System.out.println("id="+id);
        System.out.println("name="+name);

    }
}

public class Student {

    public static void main(String[] args) {
        Stu a=new Stu();
        a.set();
        System.out.println("collegname=="+Stu.collegename);
    }
}
