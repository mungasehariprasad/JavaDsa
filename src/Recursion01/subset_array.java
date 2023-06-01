package Recursion01;
public class subset_array {
    static void subset(int[] arr, int idx, int sum){
       if (idx>=0){
           System.out.println(sum);
           return;
       }
        subset(arr, idx+1,sum+arr[idx]);
        subset(arr, idx+1,sum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        subset(arr, 0,0);
    }
}
