 class Ampl
{
    String ampname;
    int ampid;
    double ampsalary;
    public Ampl(String a,int b,double c){
        ampname=a;
        ampid=b;
        ampsalary=c;

    }
    public void get(){
        System.out.println("name="+ampname);
        System.out.println("id="+ampid);
        System.out.println("salary="+ampsalary);
    }
}

public class hari9 {
    public static void main(String[] args) {
        Ampl k=new Ampl("HARI",23,50000.0);
        k.get();
    }
}
