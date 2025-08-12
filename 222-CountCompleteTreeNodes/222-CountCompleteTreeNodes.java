// Last updated: 12/8/2025, 7:57:15 pm
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
    public int countNodes(TreeNode root) {
      return count(root);
    }
   public int count(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int a = count(root.left);
    int b = count(root.right);
    return 1 + a + b;
}

}