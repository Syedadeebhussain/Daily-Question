// Last updated: 11/8/2025, 2:31:42 pm
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ll = new ArrayList<>();
        find(root, ll);
        return ll.get(k - 1); 
    }

    private void find(TreeNode root, List<Integer> ll) {
        if (root == null) {
            return;
        }
        find(root.left, ll);
        ll.add(root.val);
        find(root.right, ll);
    }
}
