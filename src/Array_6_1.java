import java.util.Scanner;

public class Array_6_1 {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] maek(int[] arr){
        int n=arr.length;


        for (int i=0; i < n;i++){
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n + "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
       int[] pref=maek(arr);
        printArray(pref);
    }
}
