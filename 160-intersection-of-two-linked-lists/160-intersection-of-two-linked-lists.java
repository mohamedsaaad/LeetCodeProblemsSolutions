/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=(a!=null)?a.next:headB;
            b=(b!=null)?b.next:headA;
        }
        return a;
    }

    
    public ListNode getIntersectionNodeOtherSolution(ListNode headA, ListNode headB) {
        int listASize=len(headA);
        int listBSize=len(headB);
        while(listASize > listBSize){
            headA=headA.next;
            listASize--;
        }
        while(listASize < listBSize){
            headB=headB.next;
            listBSize--;
        }
        while(headA != headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
    public int len(ListNode node){
        int size=0;
        while(node!=null){
            node=node.next;
            size++;
        }
        return size++;
    }
}