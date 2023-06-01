 abstract class A{
    void get(){
        System.out.println("this is a get method");
    }

    abstract void set();
    void put(){
        System.out.println("This is a game");
    }
}
class B extends A{
    void set(){
        System.out.println("This is a set method");
    }
    void put(){
        super.put();
        System.out.println("This is a Name");
    }
    void dis(){
        System.out.println("This is a display");
    }

}


public class Abs_1 {
    public static void main(String[] args) {
        B s=new B();
        s.set();
        s.put();
        s.dis();
        s.get();


    }
}


