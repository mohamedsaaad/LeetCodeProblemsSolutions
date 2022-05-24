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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode prev= new ListNode(0,head);
        ListNode result=prev;
        ListNode cur=head;
        while(cur != null){
            if(cur.val==val){
                prev.next=cur.next;
            }else{
                prev=prev.next;
            }
            cur=cur.next;
        }
        return result.next;
    }
}