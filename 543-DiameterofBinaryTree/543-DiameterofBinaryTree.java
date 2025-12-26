// Last updated: 26/12/2025, 10:15:34 am
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
17    class DiaPair{
18    int dia=0;
19    int ht=-1;
20}
21    public int diameterOfBinaryTree(TreeNode root) {
22       DiaPair ans=diameter(root);
23       return ans.dia; 
24    }
25    public DiaPair diameter(TreeNode root){
26        if(root==null){
27            return new DiaPair();
28        }
29        DiaPair ldp=diameter(root.left);
30        DiaPair rdp=diameter(root.right);
31        DiaPair sdp= new DiaPair();
32        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
33        int sd=ldp.ht+rdp.ht+2;
34        sdp.dia=Math.max(sd,Math.max(ldp.dia,rdp.dia));
35        return sdp;
36    }
37
38}
39