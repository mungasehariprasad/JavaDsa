package Data_structures_java;
 class Linked_list {
     Node head;
     Node prev;
     private int size;
     Linked_list(){
         this.size=0;
     }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//    Add ----1)First Add 2)List Add
//    1) First Add

    public void addfirst(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
//    2) Last Add
    public void addLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }
//    print
     public void printlist(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
         Node curNode=head;
         while (curNode!=null){
             System.out.print(curNode.data + " ");
             curNode=curNode.next;
         }
         System.out.println("Null");
     }


//     delete First
     public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty ");
            return;
        }
        size--;
        head=head.next;
     }
//     delete last
     public void deleteLast(){
        if (head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

     }
     public int getSize(){
         return size;
     }

     public void reverseIterate(){
         if (head==null||head.next==null){
             return;
         }
         Node prevNode=head;
         Node currNode=head.next;
         while (currNode!=null){
             Node nextNode=currNode.next;
             currNode.next=prevNode;

             prevNode=currNode;
             currNode=nextNode;
         }
         head.next=null;
         head=prevNode;



     }
//     Recursive
     public Node reverseRecursive(Node head){
         if (head==null||head.next==null){
             return head;
         }
         Node newHaed=reverseRecursive(head.next);
         head.next.next=head;
         head.next=null;
         return newHaed;
     }


    public static void main(String[] args) {
         Linked_list list=new Linked_list();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.addLast(4);
         list.addLast(5);
         list.printlist();
       list.head= list.reverseRecursive(list.head);
//         list.reverseIterate();
         list.printlist();



//
//         list.addfirst(5);
//         list.addfirst(4);
//         list.printlist();
//
//         list.addLast(3);
//         list.printlist();
//
//         list.addfirst(2);
//         list.printlist();
//
//         list.deleteFirst();
//         list.printlist();
//
//         list.deleteFirst();
//         list.printlist();
//
//        System.out.println(list.getSize());
//        list.addfirst(1);
//
//        list.printlist();
//        System.out.println(list.getSize());
//
//




    }
}
