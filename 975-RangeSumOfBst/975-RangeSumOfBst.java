// Last updated: 31/7/2025, 2:25:09 pm
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.val>=low && root.val<=high)
        {
        sum=root.val;
        }
        int l= rangeSumBST(root.left, low,  high);
        int r=  rangeSumBST(root.right,low,  high);
          return sum+l+r;
    }
}