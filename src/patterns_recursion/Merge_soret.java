package patterns_recursion;

import java.util.Arrays;

public class Merge_soret {
    static int[] merge(int[] arr){
        if (arr.length==1)return arr;
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left);
    }
    public static void main(String[] args) {

    }
}
