// Last updated: 13/8/2025, 6:28:27 pm
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> st=new ArrayList<>();
        binaryTreePaths1(root,st,"");
     return st;
       
    }
    public void binaryTreePaths1(TreeNode root,List<String> st,String s) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            s+=root.val;
            st.add(s);
            return ;
        }
        binaryTreePaths1(root.left,st,s+root.val+"->");
        binaryTreePaths1(root.right,st,s+root.val+"->");
    }
}