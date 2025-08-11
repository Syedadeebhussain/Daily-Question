// Last updated: 11/8/2025, 2:56:59 pm
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll = new ArrayList<>();
        List<Integer> ll1 = new ArrayList<>();
        find(root1, ll);
        find(root2, ll1);
        ll.addAll(ll1);
        Collections.sort(ll);
        return ll;
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