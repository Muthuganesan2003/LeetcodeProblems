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
   
     
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null || head.next == null || k==0)return head;
       int count =0;
       ListNode mov = head;
       ListNode prev = null;
       while(mov!=null){
            count++;
            prev = mov;
            mov = mov.next;
       }
       ListNode mov1 = head;
       ListNode prev1 =null ;
       int count1 =0;
       k = k % count;
       if(k==0)return head;
       while(count1<(count-k)){
            prev1 = mov1;
            mov1 = mov1.next;
            count1++;
       }
     
       prev1.next = null;
       prev.next = head;
       return mov1;

    }
}