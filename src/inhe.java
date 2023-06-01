class a{
    a(){
        System.out.println("hari is a in ");
    }

    void get(){
        System.out.println("Hari is good boy");
    }

}
class b extends a{
    b(){
        super();
    }
    void set(){
        System.out.println("Hari is very good boy");
    }

}
class d extends b{
    d(){
        super();
    }


    void get(){

        super.get();
        System.out.println("Hari is very very Good boy");
    }
}


public class inhe {
    public static void main(String[] args) {
        d c=new d();
        c.get();
        c.set();

    }
}
