//class  Acc
//{
//    String name;
//
//    Acc(String name) {
//        this.name = name;
//
//    }
//
//    void get() {
//        System.out.println("name=" + name);
//    }
//}
//    public class  hari8  {
//        public static void main(String[] args) {
//            Acc a=new Acc("HAri");
//            a.get();
//        }
//
//
//    }

class Amp{
String ampname;
int ampid;
double salary;
Amp(String a,int b,double c){
    ampname=a;
    ampid=b;
    salary=c;
}
void get(){
    System.out.println("ampname="+ampname);
    System.out.println("ampid="+ampid);
    System.out.println("salary="+salary);
}

}
public class hari8 {
    public static void main(String[] args) {
        Amp r=new Amp("hari",234,60000.67);
        r.get();

    }
}




