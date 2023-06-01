package Collection_Framework;
import java.util.*;
public class List_Interface_Bacis {
    static void Dequeue(){
        Deque<Integer> dq=new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
        dq.pop();



    }
    public void map_hash(){
        Map<Integer,String> m=new HashMap<>();
        m.put(3,"Hari");
        m.put(1,"Krishana");
        m.put(2,"Naru");
        System.out.println(m);
    }

    static void ArrayListEx(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
    }
    static void Priority_Queue(){
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
List_Interface_Bacis l=new List_Interface_Bacis();
//        Priority_Queue();
//        Dequeue();

    }
}
