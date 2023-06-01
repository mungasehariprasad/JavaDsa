import java.util.*;

public class Arrays_1 {

    static  int coun(int [] arr, int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+"Elements");
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the x:");
        int x=sc.nextInt();

        System.out.println("count_of X:"+coun(arr,x));
    }
}
