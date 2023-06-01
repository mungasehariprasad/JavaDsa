
interface polgon{
    void gerArea(int len,int bre);
}
class Rectanle implements polgon{
    public void gerArea(int len, int bre){
        System.out.println("Area="+(len*bre));

    }
}
public class Intefaces_1 {
    public static void main(String[] args) {
        Rectanle r=new Rectanle();
        r.gerArea(4,5);
    }
}
