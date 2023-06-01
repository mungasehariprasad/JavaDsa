package Recursion01;
public class rec_array_1 {
    static void Array(int[] arr,int idx){

        if (idx==arr.length)return;
        System.out.println(arr[idx]);
        Array(arr,idx+1);
    }
    public static void main(String[] args) {
int[] arr={12,2,3,4};
Array(arr,0);
    }
}
