package pw_Stack_part1;

import java.util.Stack;

public class largest_Histogram {
    public int largest(int[] height){
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        int[] pse=new int[n];
//        Calculate nse[]
        st.push(n-1);
        nse[n-1]=n;
        for (int i=n-2;i>=0;i--){
            while (st.size()>0&&height[st.peek()]>=height[i]){
                st.pop();
            }
            if (st.size()==0)nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while (st.size()>0)st.pop();
//         Calculate pse[]
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
//        Max area of rectangle
        int max=-1;
        for (int i=0;i<n;i++){
            int area=height[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);

        }
        return max;


    }
    public static void main(String[] args) {
        largest_Histogram n=new largest_Histogram();
        int[] a={2,1,5,6,2,3};
        int[] b={1,1};
        System.out.println(n.largest(b));
        System.out.println(n.largest(a));


    }
}
