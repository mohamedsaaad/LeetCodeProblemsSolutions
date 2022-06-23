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
    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref=head;
        
        return check(head);
    }
    
    public boolean check(ListNode node){
        if(node==null) return true;
        boolean ans=check(node.next);//1- true from base case last node{1} ->
                                     //2- true from last case the node prev the last{2}
        boolean checkSimilarity=(ref.val==node.val)?true:false;
        ref=ref.next;
        return ans && checkSimilarity;
        
    }
}