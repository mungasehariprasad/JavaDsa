class Add{
    int i,sum=0;
    void num(){
        for (int i=0;i<=10;i++){
            System.out.println("num="+i);
            sum=sum+i;
        }
        System.out.println("The sum is="+sum);
    }
}

public class hari6 {
    public static void main(String[] args) {
        Add a=new Add();
        a.num();

    }
}
