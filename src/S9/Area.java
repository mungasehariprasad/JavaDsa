package S9;
class areal{
    int a,b,c;
    double d;
    void square(int r){
        a=r;
    }
    void rectangle(int b,int c){
        this.b=b;
        this.c=c;
    }
    void cicle(double d){
        this.d=d;
    }
    void get(){
        int squ=a*a;
        System.out.println("Area of Square="+squ);
        int rec=b*c;
        System.out.println(" Area of rectangle="+rec);
        double cic=(d*d)*3.14;
        System.out.println("Area of cicle="+cic);
    }
}
public class Area {
    public static void main(String[] args) {
        areal s=new areal();
        s.square(3);
        s.rectangle(5,6);
        s.cicle(8);
        s.get();

    }
}
