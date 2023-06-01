import java.util.Scanner;

class MYException extends Exception{
    @Override
    public String toString() {
        return "I an toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Hari_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<9){
            try {
//                throw new MYException();
                throw new ArithmeticException("This is Arithmetic");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished:");
                System.out.println("Yes Finished");
            }

        }
    }
}
