/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n == length) {
            return head.next;
        }

        temp = head;
        int count = 1;
        while (temp.next != null) {
            if (count == length - n) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }

        return head;
    }
}
