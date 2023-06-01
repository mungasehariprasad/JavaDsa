import java.util.*;

public class tur07a {
    public static void main(String[] args) {
        float a,b,c,d,e,f,g,h,i;
    Scanner num=new Scanner(System.in);
        System.out.println("Enter the a num");
        a=num.nextFloat();
        System.out.println("Enter the b num");
        b=num.nextFloat();
        System.out.println("Enter the c num");
        c=num.nextFloat();
        System.out.println("Enter the d num");
        d=num.nextFloat();
        System.out.println("Enter the e num");
        e=num.nextFloat();
        System.out.println("Enter the f num");
        f= num.nextFloat();
        System.out.println("Enter the g num");
        g=num.nextFloat();
        System.out.println("Enter The h num");
        h=num.nextFloat();
        System.out.println("Enter the i num");
        i=num.nextFloat();
        float cgpa=(a+b+c+d+e+f+g+h+i)/90;
        System.out.println(cgpa);
    }
}
