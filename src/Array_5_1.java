import java.util.Scanner;

public class Array_5_1 {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int left,int right){
       int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
    }
//    static void sortArray(int[] arr){
//        int n=arr.length;
//        int zero=0;
//        for (int i=0;i<n;i++){
//            if (arr[i]==0){
//                zero++;
//            }
//        }
//        for (int i=0;i<n;i++){
//            if (i<zero){
//                arr[i]=0;
//
//            }else {
//                arr[i]=1;
//            }
//        }
//
//    }
    static void sortArra(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n + "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        printArray(arr);
        sortArra(arr);
        System.out.println("SORTED ARRAY");
        printArray(arr);
    }
}
