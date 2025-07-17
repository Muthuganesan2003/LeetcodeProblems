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
    public ListNode reverseList(ListNode head) {
        ListNode mov = head;
        ListNode prev =null;
        while(mov!=null){
            ListNode temp = mov.next;
            mov.next = prev;
            prev = mov;
            mov = temp;
        }
        return prev;
    }
}