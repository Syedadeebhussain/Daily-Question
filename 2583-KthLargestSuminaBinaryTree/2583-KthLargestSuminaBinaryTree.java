// Last updated: 6/1/2026, 11:19:14 am
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
17    public long kthLargestLevelSum(TreeNode root, int k) {
18         if (root == null) return -1;
19        long max=Long.MIN_VALUE;
20        List<Long> ll=new ArrayList<>();
21        Queue<TreeNode> q=new LinkedList<>();
22        q.add(root);
23        while(!q.isEmpty()){
24            int size=q.size();
25            long s=0;
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
36            ll.add(s);
37        }
38          if (k > ll.size()) return -1;
39       Collections.sort(ll, Collections.reverseOrder());
40        return ll.get(k-1);
41    }
42}