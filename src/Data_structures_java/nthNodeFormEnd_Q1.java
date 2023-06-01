package Data_structures_java;

public class nthNodeFormEnd_Q1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        temp=head;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return  temp;
        
    }
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node nthNodedelete(Node head ,int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        if (fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null){
           slow=slow.next;
           fast=fast.next;

        }
        slow.next=slow.next.next;
        return head;

    }
    public static Node middle_ele(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node deletemidele(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null&&fast.next.next!=null&&fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(head.next==null)return null;
        return head;
    }
     public static Node cycle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=head;
        while (slow!=null){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
     }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node temp1=list1;
        Node temp2=list2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else{
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }

        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;

    }
    public static Node evenoddlinked(Node head){
        Node temp=head;
        Node temp1=new Node(100);
        Node temp2=new Node(10);
        Node odd=temp1;
        Node even=temp2;
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
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a=new Node(90);
        Node b=new Node(100);
        Node c=new Node(110);
        Node d=new Node(120);
        Node e=new Node(130);
        Node f=new Node(140);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        System.out.println(d.data);
       a= cycle(a);
        display(a);

//        90-100-110-120-130-140


//        display(a);
//        System.out.println(deletemidele(a));
//        display(a);



        
    }
}
