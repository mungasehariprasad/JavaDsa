package Data_structures_java;

public class linked_list02 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void insertAtEnd(Node head ,int data){
        Node temp=new Node(data);
        Node t=head;
        while (t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static void displayr(Node head){
        if (head==null) return;
        System.out.print(head.data +" ");
        displayr(head.next);

    }
    public static void displayreverse(Node head){
        if (head==null) return;
        displayreverse(head.next);
        System.out.print(head.data +" ");

    }
    public static int length(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(8);
        Node c=new Node(7);
        Node d=new Node(6);
        Node e=new Node(1);
        Node f=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        System.out.println(length(a));
        insertAtEnd(a,34);
        display(a);







//        display(a);
//        System.out.println(" ");
//        displayr(a);
//        System.out.println("");
//        displayreverse(a);


//        Node temp=a;    Printing the list
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }








//        for (int i=1;i<=6;i++){
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }






//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);


//        System.out.println(a.next);
//        b.next=c;
//        System.out.println(b);
//        System.out.println(c);

    }
}
