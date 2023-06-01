import java.util.*;
 class Account
 {
    double Accbal,debitbal;
    void debi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Accble");
        Accbal = sc.nextDouble();
        System.out.println("Enter the debitbal ");
        debitbal = sc.nextDouble();

        if (debitbal<=Accbal){
            System.out.println("debit Aumount Succes");

        }
        else {
            System.out.println("Bitet Aumount excecoted the accont bal");
        }




    }
}

public class hari3 {
    public static void main(String[] args) {
      Account a=new Account();
      a.debi();



    }
}
