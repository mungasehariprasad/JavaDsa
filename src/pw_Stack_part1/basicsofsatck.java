package pw_Stack_part1;

import java.util.ArrayList;
import java.util.Stack;

public class basicsofsatck {

    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
}
