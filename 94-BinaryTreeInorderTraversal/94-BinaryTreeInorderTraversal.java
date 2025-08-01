// Last updated: 31/7/2025, 2:27:09 pm
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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> ll=new ArrayList<>();
       inorder(root,ll);
       return ll;
    }
    public void inorder(TreeNode root,List<Integer> ll){
        if(root==null){
            return ;
        }
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);

    }
}