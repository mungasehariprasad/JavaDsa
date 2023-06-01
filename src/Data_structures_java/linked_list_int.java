package Data_structures_java;

import javax.management.modelmbean.ModelMBean;

class linked_list_int {
     Node head;
     class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
     public void addfist(int data){
         Node newNode=new Node(data);
         if (head==null){
             head=newNode;
             return;
         }
         newNode.next=head;
         head=newNode;
     }


         public void addlast(int data){
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
         public void printList(){
             if (head==null){
                 System.out.println("List is empty");
                 return;
             }
             System.out.println("NULL");
         }





    public static void main(String[] args) {
        linked_list_int list=new linked_list_int();
        list.addfist(2);
        list.addfist(4);
        list.addfist(3);
        list.printList();

    }
}
