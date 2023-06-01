package pw_Stack_part1;

import java.util.Stack;

public class Prev_smallr_Element {
    public void prev(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[n];
        st.push(0);
        pse[0]=-1;
        for (int i=1;i<=n-1;i++){
            while (st.size()>0&&height[st.peek()]>=height[i]){
                st.pop();
            }
            if (st.size()==0)pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
    }
    public static void main(String[] args) {
        largest_Histogram n=new largest_Histogram();
        int[] a={1,1,4,5,6,7,8};
        System.out.println(n.largest(a));
    }
}
