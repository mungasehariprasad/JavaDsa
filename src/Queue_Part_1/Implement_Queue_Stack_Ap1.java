package Queue_Part_1;

import java.util.Stack;

public class Implement_Queue_Stack_Ap1 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    public void push(int x){
        st.push(x);
    }
    public int pop(){
        while (st.size()>0){
            helper.push(st.pop());

        }
        int x= st.pop();
        while (helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    public int peek(){
        while (st.size()>0){
            helper.push(st.pop());
        }
        int x= st.peek();
        while (helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    public boolean empty(){
        if (st.size()==0)return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
