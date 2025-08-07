// Last updated: 7/8/2025, 11:58:05 am
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
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isbst;
    }
    public BstPair validBST(TreeNode root){
        if(root == null) return new BstPair();
        BstPair lbp = validBST(root.left);
        BstPair rbp = validBST(root.right);
        BstPair sbp = new BstPair();
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
        return sbp;
    }
    class BstPair{
        long min =  Long.MAX_VALUE;
        long max =  Long.MIN_VALUE;
        boolean isbst = true;
    }
}