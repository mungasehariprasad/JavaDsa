package E;
class Add{
    int i,sum=0;
    void num(){
        for (int i=1;i<=10;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("the sum is ="+sum);
    }

}
public class Onetoten {
    public static void main(String[] args) {
        Add a=new Add();
        a.num();
    }

}
