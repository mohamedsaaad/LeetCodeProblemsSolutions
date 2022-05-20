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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode result=new ListNode();
        ListNode cur=result;
        while (l1 != null || l2!= null || carry !=0){
            int val= ((l1==null)?0:l1.val) +((l2==null)?0:l2.val)+carry;
            ListNode newNode=new ListNode(val%10);
            carry=val/10;
            cur.next=newNode;
            cur=cur.next;
            l1=(l1==null)?l1:l1.next;
            l2=(l2==null)?l2:l2.next;
        }
        return result.next;

    }
}