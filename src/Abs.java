abstract class motorbik{
    abstract void brake();
    void get(){
        System.out.println("This is get method");
    }
    void put(){
        System.out.println("This is a put method");
    }
}
class sportbike extends motorbik{
    void brake(){
        System.out.println("this is a sportbike");
    }

    @Override
    void get() {
        super.get();
        System.out.println("this is a override ");

    }
}
class mountanbike extends motorbik{
    void brake(){
        System.out.println("This a brake");
    }
    void dis(){
        System.out.println("this a get");
    }
}

public class Abs {
    public static void main(String[] args) {
      mountanbike a=new mountanbike();
      a.brake();
      a.dis();
      a.put();
      sportbike b=new sportbike();
      b.brake();
      b.get();
    }
}
