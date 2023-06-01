package Recursion01;

public class Sorted_array {
    static boolean sort(int[] arr,int idx){
        if (arr.length-1==idx){
            return true;
        }
        if (arr[idx]<=arr[idx+1]){
            return sort(arr,idx+1);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,8,4};
        System.out.println(sort(arr,0));
    }
}
