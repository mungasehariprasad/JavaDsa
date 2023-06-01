package pw_Stack_part1;

public class Linkedlist_Stacks_Implementation {
    public static class Node{//User defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
       private Node head=null;
       private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if (head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void dispalyrec(Node h){
            if (h==null)return;
            dispalyrec(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
            dispalyrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;

            }
            System.out.println();
        }
        int size(){//getter
            return size;
        }
        boolean isEmpty(){
            if (size==0)return true;
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
       st.push(1);
       st.display();
        st.push(2);
        st.display();
        st.push(3); 
        st.display();
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(3);
        st.push(0);

    }
}
