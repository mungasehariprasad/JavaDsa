
public class Array4_2 {
//    static int[] rev(int[] arr){
//        int n=arr.length;
//
//        int[] ans=new int[n] ;
//        int j=0;
//        for (int i=n-1;i>=0;i--){
//            ans[j++]=arr[i];
//
//        }
//        return ans;
//
//    }
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swapInarr(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void rev(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            swapInarr(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        rev(arr);
        printArray(arr);

    }
}
