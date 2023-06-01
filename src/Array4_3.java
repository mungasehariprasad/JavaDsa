import java.util.Scanner;

public class Array4_3 {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
//    static void swap(int[] arr,int a,int b){
//       int temp=arr[i];
//       arr[i]=arr[j];
//       arr[j]=temp;
//    }

    static int[] rotate(int[] arr ,int k){
        int n=arr.length;

        k=k%n;
        int[] ans=new  int[n];
        int j=0;
        for (int i=n-k;i<n;i++){

            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];

        }
        return ans;
    }
    static void reverse(int[] arr,int i,int j){
        while (i<j){
//            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotetInprint(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

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
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println("Original Array:");
        printArray(arr);
//        int[] ans=rotate(arr,k);
        rotetInprint(arr,k);
        System.out.println("Array after Rotation ");
        printArray(arr);

    }
}
