package Recursion01;
public class rec_arr_sum {
    static int Array_sum(int[] arr,int idx){
        if (idx==arr.length)return 0;
        return arr[idx]+Array_sum(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Array_sum(arr,0));

    }
}
