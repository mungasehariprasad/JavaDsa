package Queue_Part_1;

import java.util.LinkedList;
import java.util.Queue;

public class display_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(7);
        q.add(6);
        q.add(5);
//        3 7 6 5
        Queue<Integer> hel=new LinkedList<>();
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            hel.add(q.poll());
        }
        while (hel.size()>0){
            q.add(hel.poll());
        }


    }
}
