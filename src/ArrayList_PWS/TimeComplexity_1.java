package ArrayList_PWS;
import java.util.Collections;
public class TimeComplexity_1 {
    int sum(int n){
        int ans=0;
        for (int i=0;i<=n;i++){
            ans+=i;
        }
        return ans;
    }
    void get(){
        System.out.println(sum(12));
    }
    int sum1(int n){
        int ans=n*(n+1)/2;
        return ans;
    }

    void set(){
        System.out.println(sum1(10));
    }
    public static void main(String[] args) {
        TimeComplexity_1 a=new TimeComplexity_1();
//     a.get();
    a.set();
    }
}
