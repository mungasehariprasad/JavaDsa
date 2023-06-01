package Queue_Part_1;

public class Linked_List_Circular_Queue {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueC {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
          Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next=head;
                head.next=temp;
                tail=head;

            }
            size++;
        }
        public int peek(){
            if (size==0){
                System.out.println("queue is Empty!");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if (size==0){
                System.out.println("queue is Empty!");
                return -1;
            }
            int x=head.val;
            head=head.next;
            tail.next=head;
            size--;
            return x;
        }
        public void display(){
            if (size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size==0)return true;
            else return false;
        }
    }

    public static void main(String[] args) {

        queueC c=new queueC();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.display();
    }
}
