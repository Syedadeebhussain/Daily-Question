// Last updated: 8/2/2026, 6:52:12 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18       if(root==null){
19        return true;
20       }
21       boolean l=isBalanced(root.left);
22        boolean r=isBalanced(root.right);
23         boolean s= Math.abs(height(root.left)-height(root.right))<=1;
24        return l && r && s;
25        }
26    public int height(TreeNode root){
27        if(root==null){
28            return -1;
29        }
30        int left=height(root.left);
31        int right=height(root.right);
32        return Math.max(left,right)+1;
33    }
34}