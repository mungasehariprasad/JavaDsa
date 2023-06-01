import java.util.Scanner;
import java.util.Arrays;

public class Array_4 {
    static int[] samllestandgerstelem(int[] arr){
        Arrays.sort(arr);
       int[] ans ={arr[0],arr[arr.length-1]};
       return ans;


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
        int[] ans=samllestandgerstelem(arr);
        System.out.println("smallest=" +ans[0]);
        System.out.println("largest=" +ans[1]);

    }
}
