package S;

public class sudent {
    int id;
    String name;
    double per;


   public void sudent() {
       System.out.println("this is id=");
       System.out.println("This name=");
       System.out.println("This is per=");

    }
    public sudent(int id ,String  name,double per){
        this.id=id;
        this.name=name;
        this.per=per;
    }
    public void get(){
        System.out.println("This is a id="+id);
        System.out.println("this is a name="+name);
        System.out.println("this is a per="+per);

    }

}

