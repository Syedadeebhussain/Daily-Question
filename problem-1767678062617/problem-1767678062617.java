// Last updated: 6/1/2026, 11:11:02 am
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
17    public int maxLevelSum(TreeNode root) {
18        int max=Integer.MIN_VALUE;
19        Queue<TreeNode> q=new LinkedList<>();
20        q.add(root);
21        int l=1;
22        int ans=1;
23        while(!q.isEmpty()){
24            int size=q.size();
25            int s=0;
26            for(int i=0;i<size;i++){
27                TreeNode rv=q.poll();
28                s+=rv.val;
29                if(rv.left!=null){
30                   q.add(rv.left);
31                }
32                if(rv.right!=null){
33                    q.add(rv.right);
34                }
35            }
36            if(max<s){
37                max=s;
38                ans=l;
39            }
40            l++;
41        }
42        return ans;
43    }
44}