
 class Arr{

    void sumDemo(){
        int[] arry={1,5,3,4,3,2,2};
        int sum=0;
        for (int i=0;i<arry.length;i++){
            sum=sum+arry[i];
        }
        System.out.println(sum);
    }
}

public class below {
    
    public static void main(String[] args) {
        Arr a=new Arr();
        a.sumDemo();
    }
}
