package Queue_Part_1;

import java.util.Stack;

public class Implement_Queue_Stack_Ap2 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    public void push(int x){
       if (st.size()==0)st.push(x);
       else {
           while (st.size()>0){
               helper.push(st.pop());

           }
           st.push(x);
           while (helper.size()>0){
               st.push(helper.pop());
           }
       }
    }
    public int pop(){
        return  st.pop();
    }
    public int peek(){
        return st.peek();
    }
    public boolean empty(){
        if (st.size()==0)return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
