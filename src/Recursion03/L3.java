package Recursion03;
public class L3 {
    static int search(int[] arr,int tar,int s, int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (arr[m]==tar){
            return m;
        }
        if (tar<arr[m]){
            return search(arr,tar,s,m-1);
        }
        return search(arr,tar,m+1,e);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int tar=55;
        System.out.println(search(arr,tar,0,arr.length-1));
    }
}
