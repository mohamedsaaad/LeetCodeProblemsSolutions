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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode a=head;
        ListNode b=head.next;
        head=b;
        while(a != null && b != null){
           a.next =b.next;
            b.next=a;
            if (prev!=null) prev.next=b;
            if(a.next==null) break;
            prev=a;
            a=a.next;
            b=a.next;
        }
       return head;
    }
}