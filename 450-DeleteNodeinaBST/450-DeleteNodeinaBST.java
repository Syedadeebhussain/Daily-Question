// Last updated: 10/2/2026, 12:15:11 pm
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root==null) return null;
19        if(root.val<key){
20            root.right=deleteNode(root.right, key);//will make changes in right
21        }
22        else if(root.val>key){
23              root.left=deleteNode(root.left, key);//will make changes in left
24        }
25        else{
26            if(root.left==null){
27                return root.right;
28            }
29            else if(root.right==null){
30                return root.left;
31            }
32            else{
33                int min=getmin(root.right);
34                root.val=min;
35                root.right=deleteNode(root.right,min);
36            }
37        }
38        return root;
39    }
40    public int getmin(TreeNode root){
41        if(root == null) return Integer.MAX_VALUE;
42        int l = getmin(root.left);
43        return Math.min(l,root.val);
44    }
45}