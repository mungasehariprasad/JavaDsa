public class sub {
    static void subset(int[] arr, int n, int idx, int sum) {
        if (idx >= 0) {
            System.out.println(sum);
            return;
        }
        subset(arr, n, idx + 1, sum + arr[idx]);
        subset(arr, n, idx + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        subset(arr,arr.length,0,0);


    }
}
