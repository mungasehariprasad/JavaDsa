package S8;
import java.util.*;

class Acco{
    double Accountbal,debitbal;
    void debit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account Bal=");
        Accountbal=sc.nextDouble();
        System.out.println("Enter the Debit Amount=");
        debitbal=sc.nextDouble();
        if (debitbal<=Accountbal){
            System.out.println("Debit amount Succes ");
        }
        else {
            System.out.println("Debit amount execded the acount balance");
        }

    }
    void set(){
        System.out.println("Account bal="+Accountbal);
        System.out.println("Debit Amount="+debitbal);
    }
}
public class Account {
    public static void main(String[] args) {
        Acco a=new Acco();
        a.debit();
        a.set();

    }
}
