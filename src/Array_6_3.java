import java.util.Scanner;

public class Array_6_3 {
    static int findArraysum(int[] arr){
        int totlsum=0;
        for (int i=0;i<arr.length;i++){
            totlsum+=arr[i];
        }
        return  totlsum;
    }
    static boolean equalSumpartition(int[] arr){
       int totlsum=findArraysum(arr);
       int prefsum=0;
       for (int i=0;i<arr.length;i++){
           prefsum +=arr[i];
           int suffixsum=totlsum-prefsum;
           if (suffixsum==prefsum){
               return true;
           }
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the"+ n +"element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(equalSumpartition(arr));
    }
}
