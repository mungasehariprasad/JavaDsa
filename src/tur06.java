import java.util.*;

public class tur06 {
    public static void main(String[] args) {
        float m1,m2,m3,m4,m5,m6,total ,per;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The maths maraks");
        m1=sc.nextFloat();
        System.out.println("Enter The Chem maraks");
        m2=sc.nextFloat();
        System.out.println("Enter The phy maraks");
        m3=sc.nextFloat();
        System.out.println("Enter the cs maraks");
        m4=sc.nextFloat();
        System.out.println("Enter the Eng maraks");
        m5=sc.nextFloat();
        System.out.println("Enter the Ghoy");
        m6=sc.nextFloat();
        total=m1+m2+m3+m4+m5+m6;
        System.out.println("The total num="+total);
        per=total*100/600;
        System.out.println(per);

    }
}
