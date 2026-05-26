// Last updated: 26/5/2026, 8:24:48 pm
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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18         if(subRoot == null) return true;
19        if(root==null) return false;
20        if(Solve(root, subRoot)) return true;
21        boolean left=isSubtree(root.left, subRoot);
22        boolean right=isSubtree(root.right, subRoot);
23        return left||right;
24    }
25    public boolean Solve(TreeNode r1,TreeNode r2){
26        if(r1==null && r2==null) return true;
27        if(r1==null || r2==null) return false;
28        if(r1.val!=r2.val) return false;
29        boolean a=Solve(r1.left,r2.left);
30        boolean b=Solve(r1.right,r2.right);
31        return a&&b;
32    }
33}