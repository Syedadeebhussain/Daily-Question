// Last updated: 18/10/2025, 6:47:03 am
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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
       int max= maxDepth(root);
       sum(root,1,max);
       return sum;
    }
    public int maxDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int a = maxDepth(root.left);
    int b = maxDepth(root.right);
    return 1+Math.max(a, b);
    }
    public void sum(TreeNode root,int cl,int max){
        if(root==null) return ;
        if(root.left==null && root.right==null && cl==max) {
            sum+=root.val;
            return ;
        }
        sum(root.left,cl+1,max);
        sum(root.right,cl+1,max);
    }
    

}