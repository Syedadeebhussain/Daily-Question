// Last updated: 9/2/2026, 10:36:31 am
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
17    public TreeNode balanceBST(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        find(root, ll);
20       return createTree(ll,0,ll.size()-1);
21    }
22
23    private void find(TreeNode root, List<Integer> ll) {
24        if (root == null) {
25            return;
26        }
27        find(root.left, ll);
28        ll.add(root.val);
29        find(root.right, ll);
30    }
31
32    public TreeNode createTree(List<Integer> ll,int si,int ei){
33        if(si>ei){
34            return null;
35        }
36        int mid=(si+ei)/2;
37        TreeNode nn=new TreeNode(ll.get(mid));
38        nn.left=createTree(ll,si,mid-1);
39        nn.right=createTree(ll,mid+1,ei);
40        return nn;
41        
42    }
43}