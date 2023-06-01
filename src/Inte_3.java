interface Fas{
   abstract void display();


}
interface Game{
    void put();

}
class Img implements Fas,Game{
   public void display(){
        System.out.println("Enter the display");
    }
   public void put(){
        System.out.println("Enter the put");
    }

}
class puter implements Game{

   public void put(){
        System.out.println("Enter the put and put");
    }

}


public class Inte_3 {
    public static void main(String[] args) {
puter a=new puter();
a.put();
Img b=new Img();
b.display();
b.put();

    }
}
