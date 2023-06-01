package Queue_Part_1;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Queue {
    Queue<Integer> q=new LinkedList<>();

    public void push(int x){
        q.add(x);
    }
    public int pop(){
        for (int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int x=q.remove();
        return x;
    }
    public int top(){
        for (int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int x=q.peek();
        q.add(q.remove());
        return x;
    }
    public boolean empty(){
        if (q.size()==0)return true;
        else return false;

    }
    public static void main(String[] args) {
        Implement_Stack_Queue q1=new Implement_Stack_Queue();


    }
}
