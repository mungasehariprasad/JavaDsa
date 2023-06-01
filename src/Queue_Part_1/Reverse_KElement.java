package Queue_Part_1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Reverse_KElement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        int k=4;
        for (int i=0;i<k;i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for (int i=0;i<=k-st.size()-1;i++){
            st.push(q.remove());
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
