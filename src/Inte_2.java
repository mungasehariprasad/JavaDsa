interface ram{
    void ram();
}
interface lashi{
    void lashi();

}
interface Rushi extends ram, lashi {
    void ram();
    void lashi();
    void Krish();

}
class Mungse implements Rushi{
   public void ram(){
        System.out.println("Enter the vlaue of D");
    }
   public void lashi(){
        System.out.println("Enter the vlaue of B");
    }
   public void Krish(){
        System.out.println("Eteh the vlaue is C");
    }

}


public class Inte_2 {
    public static void main(String[] args) {
        Mungse s=new Mungse();
        s.ram();
        s.lashi();
        s.Krish();

    }
}
