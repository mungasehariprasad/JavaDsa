package Queue_Part_1;
public class Linked_List_Implemention {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if (size==0){
                head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
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
        queueLL l=new queueLL();
        l.display();
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        l.display();
        System.out.println(l.peek());
        l.remove();
        l.display();
        System.out.println(l.size);
    }
}
