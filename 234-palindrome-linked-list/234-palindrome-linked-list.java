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
//     ListNode ref;
//     public boolean isPalindrome(ListNode head) {
//         ref=head;
        
//         return check(head);
//     }
    
//     public boolean check(ListNode node){
//         if(node==null) return true;
//         boolean ans=check(node.next);//1- true from base case last node{1} ->
//                                      //2- true from last case the node prev the last{2}
//         boolean checkSimilarity=(ref.val==node.val)?true:false;
//         ref=ref.next;
//         return ans && checkSimilarity;
        
//     }
    
    
    
    public boolean isPalindrome(ListNode head){
    //use floyd cycle detection algorithm
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev,temp;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //then when fast till to end slow is in the middle of the list
        //so start reverse
        prev=slow;
        slow=slow.next;
        prev.next=null;
        while(slow != null){
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        //h5rog mn hena nos el list el a5er reversed wel slow wa2ef b3d a5er node bnode         //el wa2ef 3l a5era bzbt el prev.
        fast=head;
        slow=prev;
        while(slow != null){
            if(fast.val != slow.val)
                return false;
            else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        return true;
    }
}