package pw_Stack_part1;

import java.util.Stack;

public class next_smallry_element {
    public void largest(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
//        Calculate nse[]
        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && height[st.peek()] > height[i]) {
                st.pop();
            }
            if (st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

    }
    public static void main(String[] args) {
        largest_Histogram n=new largest_Histogram();
        int[] a={1,3,2,1,8,6,3,4};
        System.out.println(n.largest(a));

    }
}
