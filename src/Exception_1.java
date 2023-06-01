
public class Exception_1 {
    static void fun(){
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Cogent Inside fun");
            throw  e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        }
        catch (NullPointerException e){
            System.out.println("This is main");
        }
    }
}
