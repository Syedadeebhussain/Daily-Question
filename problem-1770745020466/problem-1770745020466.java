// Last updated: 10/2/2026, 11:07:00 pm
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
17    public int findBottomLeftValue(TreeNode root) {
18        if (root == null) return 0;
19        Queue<TreeNode> q=new LinkedList<>();
20        q.add(root);
21            int max=0;
22        while(!q.isEmpty()){
23            int size=q.size();
24            for(int i=0;i<size;i++){
25             TreeNode rm=q.poll();
26             if(i==0){
27                max=rm.val;
28             }
29             if(rm.left!=null){
30                q.add(rm.left);
31             }
32             if(rm.right!=null){
33                q.add(rm.right);
34             }
35            }
36        } 
37        return max;
38    }
39}
40