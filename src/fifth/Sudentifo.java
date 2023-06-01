package fifth;
import javax.sound.midi.Soundbank;
import java.util.*;
class student{
    int id;
    String name,Add;
    double per;
    void put(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student id=");
        id=sc.nextInt();
        System.out.println("Enter the student name =");
        name=sc.next();
        System.out.println("Enter the student Add=");
        Add=sc.next();
        System.out.println("Enter the student perccebtede=");
        per=sc.nextDouble();
    }
    void display(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("Add"+Add);
        System.out.println("per="+per);
    }
}


public class Sudentifo {
    public static void main(String[] args) {
        student a=new student();
        a.put();
        a.display();
    }
}
