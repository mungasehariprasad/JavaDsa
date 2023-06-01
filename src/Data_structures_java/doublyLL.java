package Data_structures_java;



public class doublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
    public static void displayall(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void displayallrev(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;

        }
        System.out.println();
    }
    public static void displayrandom(Node random){
        Node temp=random;
        while (temp.prev!=null){
            temp=temp.prev;
        }
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHeadDLL(Node head,int x){
        Node t=new Node(30);
        t.next=head;
        head.prev=t;
        head=t;
        return head;


    }
    public static void insertEnd(Node head,int x){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtInx(Node head,int inx,int x){
        Node s=head;
        for (int i=1;i<=inx-1;i++){
            s=s.next;

        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r.next;
        r.prev=t;
    }
    public static void deleteHead(Node head){
        while (head==null) {
            head = head.next;
            head.prev = null;
        }
    }
    public static void deletetail(Node head){
        Node temp=head;
        while (temp.next!=null){
           if (temp.next==null){
               temp.next=null;
               temp=temp.prev;
           }

        }

    }
    public static Boolean palindromelist(Node head) {
        Node h = head;
        Node tail = null;
        tail = head.next;
        Node t = tail;
        while (h != t) {
            if (h.val != t.val) return false;
            h=h.next;
            t=t.prev;
        }
        return true;

    }


    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//        displayallrev(e);
//        displayrandom(a);
//        displayall(a);
//        Node newhead=insertAtHeadDLL(a,54);
//        displayall(newhead);
//        insertEnd(a,55);
//        insertAtInx(a,3,94);
        displayall(a);
        palindromelist(a);
//        deletetail(a);
        displayall(a);
//        deleteHead(a);





    }
}
