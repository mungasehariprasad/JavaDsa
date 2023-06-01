package Queue_Part_1;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Bsc_STL {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(7);
        q.add(6);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());


    }
}
