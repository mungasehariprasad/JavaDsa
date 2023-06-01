import java.util.Scanner;
public class Array_3_4 {
    static int findmax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int fidensecond(int[] arr){
        int mx=findmax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secodemx=findmax(arr);
        return secodemx;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+"Elements");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(fidensecond(arr));
    }
}
