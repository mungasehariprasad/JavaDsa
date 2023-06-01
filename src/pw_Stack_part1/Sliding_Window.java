package pw_Stack_part1;

import java.util.Arrays;

public class Sliding_Window {
    public int[] max(int[] nums,int k){
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int z=0;
        for (int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for (int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);

            }
            ans[z++]=max;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        Sliding_Window sliding_window=new Sliding_Window();
        System.out.println(Arrays.toString(sliding_window.max(nums, 4)));

    }
}
