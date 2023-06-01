package Leetcode;

public class Reverse_Linked_list {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class ReverseSublist {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (head == null || left == right) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode prev = dummy;
            for (int i = 0; i < left - 1; i++) {
                prev = prev.next;
            }

            ListNode curr = prev.next;
            ListNode next = null;

            for (int i = 0; i < right - left; i++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Reverse_Linked_list r=new Reverse_Linked_list();
     }
}
