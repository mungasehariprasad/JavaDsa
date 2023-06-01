package pw_Stack_part1;

import java.util.Arrays;
import java.util.Stack;

public class Sliding_Window_Ap2 {
    public int[] max(int[] nums,int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int z = 0;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        st.push(n-1);
        nge[n-1]=n;
      for (int i=n-2;i>=0;i--){
          while (st.size()>0&&nums[i]>nums[st.peek()])st.pop();
          if (st.size()==0)nge[i]=n;
          else nge[i]=st.peek();
          st.push(i);
      }
        int j=0;
      for (int i=0;i<n-k+1;i++){
       if (j>=i+k)j=i;
          int max=nums[j];
          while (j<i+k){
              max=nums[j];
              j=nge[j];
          }
          ans[z++]=max;
      }
      return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        Sliding_Window_Ap2 sliding_window=new Sliding_Window_Ap2();
        System.out.println(Arrays.toString(sliding_window.max(nums, 3)));
    }
}
