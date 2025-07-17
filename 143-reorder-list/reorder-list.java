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
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode mov = head;
        while(mov!=null){
            ListNode temp = mov.next;
            mov.next  = prev ;
            prev = mov;
            mov = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondList = reverseList(slow.next);
        slow.next =  null;
        ListNode firstList =  head;
        while(firstList!=null && secondList!=null){
            ListNode temp1 = firstList.next;
            firstList.next = secondList;
            ListNode temp2 = secondList.next;
            secondList.next = temp1;
            firstList = temp1;
            secondList = temp2;
        }
    
    }
}