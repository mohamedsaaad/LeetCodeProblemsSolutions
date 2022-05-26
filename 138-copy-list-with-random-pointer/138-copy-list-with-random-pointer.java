/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    private Node checkFoundOrNot(HashMap<Node,Node> ref,Node node){
        if(node==null)
            return null;
        if(!ref.containsKey(node)){
            ref.put(node,new Node(node.val));
        }
        return ref.get(node);
    }

    
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        HashMap<Node,Node> ref=new HashMap<>();
        Node newHead=new Node(head.val);
        Node newCur=newHead;
        Node oldCur=head;
        ref.put(oldCur, newCur);

        while(oldCur != null){
            Node next=checkFoundOrNot(ref,oldCur.next);// rg3t hedna bel next
            Node random=checkFoundOrNot(ref,oldCur.random);// rg3t hedna bel random
            newCur.next=next;
            newCur.random=random;
            newCur=newCur.next;
            oldCur=oldCur.next;
        }
      return newHead; 
    }
}