class Stud
{
    int sudid;
    String name;
    float marks;
    double per;
    void set(int a,String b,float c,double d){
        sudid=a;
        name=b;
        marks=c;
        per=d;

    }
    void stes(int a,String b,float c,double d){
        sudid=a;
        name=b;
        marks=c;
        per=d;
    }
    void seta(int a,String b,float c,double d){
        sudid=a;
        name=b;
        marks=c;
        per=d;
    }
    void setp(int a,String b,float c,double d){
        sudid=a;
        name=b;
        marks=c;
        per=d;
    }
    void  get(){
        System.out.println("sudid="+sudid);
        System.out.println("name="+name);
        System.out.println("marks="+marks);
        System.out.println("per="+per);
    }



}
public class hari2 {
    public static void main(String[] args) {
        Stud a=new Stud();
        a.set(12,"harimungase",555,90);
        a.get();

    }
}
