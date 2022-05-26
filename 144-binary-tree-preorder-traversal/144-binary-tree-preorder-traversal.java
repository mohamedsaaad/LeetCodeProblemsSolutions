/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void preOrderTreeTraversal(List<Integer>result,TreeNode node){
        if(node == null) return;
            result.add(node.val);
            preOrderTreeTraversal(result,node.left);
            preOrderTreeTraversal(result,node.right);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preOrderTreeTraversal(result,root);
        
        return  result;
    }
}