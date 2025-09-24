// Last updated: 24/9/2025, 9:33:47 pm
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
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left,root.right,1);
        return root;
    }
public void  reverse(TreeNode left,TreeNode right,int l){
    if(right==null || left==null){
        return ;
    }
    if(l%2==1){
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
    }
     reverse(left.left,right.right,l+1);
     reverse(left.right,right.left,l+1);
}
}