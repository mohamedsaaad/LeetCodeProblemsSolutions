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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode newHead=new ListNode(head.val,null);
        int curValue=newHead.val;
        ListNode oldCur=head.next;
        ListNode newCur=newHead;
        while(oldCur != null){
            if(curValue != oldCur.val){
                ListNode newNode=new ListNode(oldCur.val,null);
                newCur.next=newNode;
                newCur=newNode;
                curValue=newCur.val;
            }
            oldCur=oldCur.next;
        }
        return newHead;
    }
}