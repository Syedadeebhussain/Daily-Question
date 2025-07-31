// Last updated: 31/7/2025, 2:26:58 pm
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
    public boolean isBalanced(TreeNode root) {
       if(root==null){
        return true;
       }
       boolean l=isBalanced(root.left);
        boolean r=isBalanced(root.right);
         boolean s= Math.abs(height(root.left)-height(root.right))<=1;
        return l && r && s;
        }
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}