package pw_Stack_part1;

import java.util.Scanner;
import java.util.Stack;

public class copystack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
//        System.out.println("Enter the number of elements ");
//        int n=sc.nextInt();
//        System.out.println("Enter the elements ");
//        for (int i=1;i<=n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
//        revers order
        Stack<Integer> gt=new Stack<>();
        while (st.size()>0){
//            int x=st.peek();
//            rt.push(x);
//            st.pop();
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt=new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
