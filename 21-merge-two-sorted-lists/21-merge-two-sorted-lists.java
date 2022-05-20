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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head=new ListNode();
        ListNode cur=head;
        int value=0;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                value=list1.val;
                list1=list1.next;
            }else{
                value=list2.val;
                list2=list2.next;
            }
            ListNode temp=new ListNode(value);
            cur.next=temp;
            cur=cur.next;
        }
        while(list1!=null){
            value= list1.val;
            ListNode temp=new ListNode(value);
            list1=list1.next;
            cur.next=temp;
            cur=cur.next;
        }

        while(list2!=null){
            value= list2.val;
            ListNode temp=new ListNode(value);
            list2=list2.next;
            cur.next=temp;
            cur=cur.next;
        }

        return head.next;
        
    }
}