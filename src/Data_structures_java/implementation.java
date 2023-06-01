package Data_structures_java;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linked_list{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if (head==null){
                head=temp;

            }else {
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBeginning(int data){
            Node new_Node=new Node(data);
            if (head==null){
                head=new_Node;
            }
            new_Node.next=head;
            head=new_Node;
        }
        void insertAt(int data,int idx){
            Node new_Node=new Node(data);
            Node temp=head;
            if (idx==size()){
                insertAtEnd(data);
                return;
            }
            else if(idx==0){
                insertAtBeginning(data);
                return;
            }
            else if (idx<0||idx<size()){
                System.out.println("Wrong inx");
                return;
            }

            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            new_Node.next=temp.next;
            temp.next=new_Node;

        }
        int getAt(int idx){
            Node temp=head;
            if (idx<0||idx<size()){
                System.out.println("Wrong inx");
                return -1;
            }
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;

        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int cunt=0;
            while (temp!=null){
                cunt++;
                temp=temp.next;
            }
            return cunt;
        }

    }
    public static nthNodeFormEnd_Q1.Node evenoddlinked(nthNodeFormEnd_Q1.Node head){
        nthNodeFormEnd_Q1.Node temp=head;
        nthNodeFormEnd_Q1.Node temp1=new nthNodeFormEnd_Q1.Node(100);
        nthNodeFormEnd_Q1.Node temp2=new nthNodeFormEnd_Q1.Node(10);
        nthNodeFormEnd_Q1.Node odd=temp1;
        nthNodeFormEnd_Q1.Node even=temp2;
        while(head!=null){
            odd.next=head;
            head=head.next;
            odd=odd.next;
            if(head!=null){
                even.next=head;
                head=head.next;
                even=even.next;
            }
        }
        even.next=null;
        odd.next=temp2.next;
        return temp1.next;


    }
    public static void main(String[] args) {
        linked_list ll=new linked_list();
        ll.insertAtEnd(4);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.display();
        evenoddlinked();
        
//        System.out.println();
//        ll.insertAtBeginning(5);
//        ll.insertAtBeginning(9);
//        ll.display();
//        System.out.println();
//        ll.insertAt(10,2);
//        ll.display();
//        System.out.println();
//        ll.insertAt(111,4);
//        ll.display();
//        System.out.println();
//        ll.insertAt(12,0);
//        ll.display();
//        System.out.println();
//        System.out.print(ll.getAt(0));
//        ll.deleteAt(4);
//        ll.display();
         

//        System.out.println();
//        System.out.println(ll.size());




    }

    private static void evenoddlinked() {
    }
}
