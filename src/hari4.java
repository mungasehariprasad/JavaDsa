class Area{
    int r,l,b;
    double s;

    void squ(int a){
        r=a;

    }
    void ret(int u,int p){
        l=u;
        b=p;
    }
    void cir(int i){
        s=i;
    }
    void dis(){
        int k=r*r;
        System.out.println("squ="+k);
        int f=l*b;
        System.out.println("ret="+f);

        double h=(s*s)*3.14;
        System.out.println("cir="+h);

    }
}
public class hari4 {
    public static void main(String[] args) {
        Area d=new Area();
        d.squ(3);
        d.ret(3,6);
        d.cir(4);
        d.dis();

    }
}
