package Recursion01;
public class rec_arr_max {
    static int array_max_value(int[] arr,int idx){
        if (idx==arr.length-1) return arr[idx];
        return Math.max(arr[idx],array_max_value(arr,idx+1));
    }
    public static void main(String[] args) {
int[] arr={2,3,4,5,6};
        System.out.println(array_max_value(arr,0));
    }
}
