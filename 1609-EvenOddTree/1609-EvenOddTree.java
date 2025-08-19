// Last updated: 19/8/2025, 6:33:01 pm
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
    int c=0;
    public boolean isEvenOddTree(TreeNode root) {
           return find(root) ;
    }
    public boolean find(TreeNode root){
            if (root == null) return true;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();
                int prev = (c % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                for (int i = 0; i < levelSize; i++) {
                    TreeNode r = q.remove();
                    if(c%2==0){
                          if(r.val%2==0 || r.val<=prev) return false;
                    }
                    else {
                        if(r.val%2==1 || r.val>=prev) return false;
                    }
                    prev=r.val;
                    if (r.left != null) q.add(r.left);
                    if (r.right != null) q.add(r.right); 
                }
                c++;
                
            }
            return true;
    }
}