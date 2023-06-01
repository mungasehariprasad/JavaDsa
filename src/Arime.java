class ret
{
    int a,b;
    double d,sum ,e;
    float g,h;
     ret(int a,int b){
        this.a=a;
        this.b=b;
        sum=a+b;
        System.out.println("sum="+sum);


    }
     ret(int a,double d){
        this.a=a;
        this.d=d;
        sum=a+d;
        System.out.println("sum="+sum);
    }
     ret(int b,float g,int a){
         this.b=b;
         this.g=g;
         this.a=a;
         sum=b+g+a;
        System.out.println("sum="+sum);
    }
}
public class Arime {
    public static void main(String[] args) {
        ret l=new ret(2,3);
        ret p=new ret(3,5.44);
        ret o=new ret(4,3.3f,6);

    }
}
