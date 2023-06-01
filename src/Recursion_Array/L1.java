package Recursion_Array;
public class L1 {
    static boolean sort(int[] arr,int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1]&&sort(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={2,2,4,5,6};
        System.out.println(sort(arr,0));
    }
}
