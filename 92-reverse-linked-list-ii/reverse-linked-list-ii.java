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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || head.next == null|| left == right)return head;
        ListNode mov = head;
        ListNode prev = null;
        int count = 0;
        while(count<= right){
            count ++;
            
            if(count == left){
               ListNode subPrev = null;
               ListNode subTail =  mov;
               while(count<=right){
                    ListNode temp = mov.next;
                    mov.next = subPrev;
                    subPrev = mov;
                    mov = temp;
                    count++;
               }
               subTail.next = mov;
               if(prev!=null){  
                    prev.next = subPrev;
               }
               else{
                head = subPrev;
               }
               break;
            }
            prev = mov;
            mov = mov.next;
        }
        return head;
    }
}