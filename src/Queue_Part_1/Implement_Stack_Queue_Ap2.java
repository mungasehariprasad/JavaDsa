package Queue_Part_1;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Queue_Ap2 {
    Queue<Integer> q=new LinkedList<>();
    public void push(int x){
        if (q.size()==0)q.add(x);
        else {
            q.add(x);
            for (int i=1;i<= q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }
    public int pop(){
        return q.remove();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        if (q.size()==0)return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
