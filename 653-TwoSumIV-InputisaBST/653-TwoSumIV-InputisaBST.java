// Last updated: 3/9/2025, 9:02:25 pm
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
    public boolean findTarget(TreeNode root, int k) {
       Set<Integer> st = new HashSet<>();
     return inorder(root,st,k);  
    }
    public boolean  inorder(TreeNode root,Set<Integer> st,int k){
        if(root==null){
            return false;
        }
        boolean a=inorder(root.left,st,k);
      if(st.contains(k-root.val)) return true;
        st.add(root.val);
        boolean b=inorder(root.right,st,k);
        return a || b;
    }
}