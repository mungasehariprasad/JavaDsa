class Acconunt
{
    int Accid;
    String Accname;
    void set(int a,String b){
        Accid=a;
        Accname=b;
    }
    void sets(int a,String b){
        Accid=Accid;
        Accname=Accname;
    }
    void get(){
        System.out.println("Accid="+Accid);
        System.out.println("Accname="+Accname);

    }

}


public class hari {
    public static void main(String[] args) {
        Acconunt a=new Acconunt();
        a.set(101,"BIO Bank");
        a.get();
        a.sets(102,"INA Bank");
        a.get();

    }
}
