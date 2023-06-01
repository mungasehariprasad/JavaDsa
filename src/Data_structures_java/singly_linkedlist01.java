package Data_structures_java;

import java.util.Scanner;

public class singly_linkedlist01 {
    static class Node{
     int data;
     Node next;
     Node(int data){
         this.data=data;
         this.next=null;
     }
    }
    Node head=null;

    public void creation(){
    int data,n,m;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Enter 1 to insert the item at beginning ,2 to insert the item at the end 3 to insert it ");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:


                        break;

                    case 3:


                        break;
                }


                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do u Want to add more data if yes ,pres");
            n = sc.nextInt();
        }while (n==1);
    }
    public void traverser(){
        Node temp=head;
        if (head==null){
            System.out.println("LL dose mot exist");
        }
        else {
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }

    }

    public static void main(String[] args) {


        singly_linkedlist01 ll=new singly_linkedlist01();
        ll.creation();
        ll.traverser();


    }
}
