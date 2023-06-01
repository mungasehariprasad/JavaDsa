package Recursion02;
import java.util.Scanner;
public class L7 {
    static boolean array(int i, int[] arr, int n){
        if (i>=n/2){
            return false;
        }
       swap(arr[i],arr[n-i-1]);
        array(i+1,arr,0);
        return false;
    }
    static void swap(int i, int i1) {

    }
    static void swap(){
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(array(0,arr,n));
    }
}
