// Last updated: 13/8/2025, 6:37:28 pm
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
    int s=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root);
        return s;
    }
    public void sum(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left!=null &&(root.left.left==null && root.left.right==null)){
            s+=root.left.val;
        }
        sum(root.left);
        sum(root.right);

    }
}