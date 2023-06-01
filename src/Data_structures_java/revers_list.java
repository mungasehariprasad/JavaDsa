package Data_structures_java;

public class revers_list {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;

        }

    }

    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;

    }
    public boolean isPalindrome(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node temp=reverse(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;

    }
    public static void main(String[] args) {
        reversallist.Node a=new reversallist.Node(3);
        reversallist.Node b=new reversallist.Node(5);
        reversallist.Node c=new reversallist.Node(1);
        reversallist.Node d=new reversallist.Node(2);
        reversallist.Node e=new reversallist.Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;


    }
}
